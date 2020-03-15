/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.books.utility;

import com.books.dao.GenericDAO;
import com.books.daoimpl.BookDetailDAOImpl;
import com.books.models.BookDetail;
import com.books.business.MessageForm;
import java.io.File;  
import java.io.FileInputStream;  
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;  
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;  
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Kashif Alei
 */
public class ExcelUtility {

    static String pattern = "yyyy-MM-dd";
    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    private static Integer batch = 0;
    public static final Integer IS_STRING = 1;
    public static final Integer IS_NUMERIC = 2;
    public static final Integer IS_BLANK = 3;
    
    public static boolean readFromExcel(String filePath) {
        try {
            File file = new File(filePath);   //creating a new file instance  
            FileInputStream inputStream = new FileInputStream(file);
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet firstSheet = workbook.getSheetAt(0);
            Iterator<Row> iterator = firstSheet.iterator();
            int count = 0;
            List<BookDetail> loadedBooks = new ArrayList<BookDetail>();
            while (iterator.hasNext()) {
                Row nextRow = iterator.next();
                Iterator<Cell> cellIterator = nextRow.cellIterator();
                if (count==0) {
                   count = 1;
                   continue;
                }
                BookDetail bookDetail = new BookDetail();
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    if (cell == null || cell.getCellType() == Cell.CELL_TYPE_BLANK) {
                      continue;
                    }
                    int check = check = checkCellType(cell);
                    int columnIndex = cell.getColumnIndex();
                    switch (columnIndex) {
                        case 0:
                            if(check==1)
                            {
                                bookDetail.setKeyword(cell.getStringCellValue());
                            }else if(check==2){
                                bookDetail.setKeyword(String.valueOf(cell.getNumericCellValue()));
                            }else{
                              continue;
                            }
                            break;
                        case 1:
                            check = checkCellType(cell);
                            if(check==1)
                            {
                                bookDetail.setTitle(cell.getStringCellValue());
                            }else if(check==2){
                                bookDetail.setTitle(String.valueOf(cell.getNumericCellValue()));
                            }else{
                              continue;
                            }
                            break;
                        case 2:
                            if(check==1)
                            {
                                bookDetail.setBsr(Long.valueOf(cell.getStringCellValue()));
                            }else if(check==2){
                                bookDetail.setBsr(Long.valueOf(String.valueOf((int) cell.getNumericCellValue())));
                            }else{
                              continue;
                            }
                            break;
                        case 3:
                            if(check==1)
                            {
                                bookDetail.setNoOfReviews(Integer.parseInt(cell.getStringCellValue()));
                            }else if(check==2){
                                bookDetail.setNoOfReviews(Integer.parseInt(String.valueOf((int) cell.getNumericCellValue())));
                            }else{
                              continue;
                            }
                            break;
                        case 4:
                            if(check==1)
                            {
                                bookDetail.setDateOfPublication(cell.getStringCellValue());
                            }else if(check==2){
                                Date publicationDate= DateUtil.getJavaDate((double) cell.getNumericCellValue()); 
                                bookDetail.setDateOfPublication(new SimpleDateFormat("yyyy-MM-dd").format(publicationDate));
                            }else{
                              continue;
                            }
                            break;
                        case 5:
                            if(check==1)
                            {
                                bookDetail.setPrice(Double.valueOf(cell.getStringCellValue()));
                            }else if(check==2){
                                bookDetail.setPrice(cell.getNumericCellValue());
                            }else{
                              continue;
                            }
                            break;
                    }
                }
                boolean isSavable = isSavable(bookDetail);
                if(isSavable)
                {
                    loadedBooks.add(bookDetail);
                    batch++;
                    //System.out.println(bookDetail);
                }
                if(batch == 10)
                {
                    batch = 0;
                    saveRecord(loadedBooks);
                    count+=10;
                    loadedBooks.clear();
                }
            }
            if(loadedBooks.size()>0)
            {
                saveRecord(loadedBooks);
                count+=loadedBooks.size();
                loadedBooks.clear();
            }
            count--;
            new MessageForm("Success", count+" records have been loaded.", "info.png").setVisible(true);
            workbook.close();
            inputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
            new MessageForm("Error", "Colud not load the xlsx file, try again.", "error").setVisible(true);
            return false;
        }
        return true;
    }
    
    public static Integer checkCellType(Cell cell)
    {
        CellType cellType = cell.getCellTypeEnum();
        if (cellType == CellType.STRING) {
            return IS_STRING;
        } else if (cellType == CellType.NUMERIC) {
            return IS_NUMERIC;
        } else if (cellType == CellType.BLANK) {
            return IS_BLANK;
        }
        return -1;
    }
    

    
    public static void main(String[] args) {
        readFromExcel("C:\\Users\\Kashif Alei\\Desktop\\test input.xlsx");
    }

    private static boolean isSavable(BookDetail bookDetail) {
        
        if(bookDetail.getBsr()==null || bookDetail.getDateOfPublication()==null || bookDetail.getKeyword()==null || bookDetail.getNoOfReviews()==null || bookDetail.getPrice()==null)
        {
            return false;
        }
        return true;
    }

    private static void saveRecord(List<BookDetail> loadedBooks) {
        GenericDAO<BookDetail> bookDetailDAO = new BookDetailDAOImpl();
        for (Iterator<BookDetail> iterator = loadedBooks.iterator(); iterator.hasNext();) {
            BookDetail next = iterator.next();
            bookDetailDAO.save(next);
        }
    }
}
