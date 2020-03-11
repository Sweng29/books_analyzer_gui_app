/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.books.utility;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Kashif Alei
 */
public class ExcelUtility {

    public static void readFromExcel(String file) {
//        try {
//            System.err.println("Reading file : "+file);
//            XSSFWorkbook myExcelBook = new XSSFWorkbook(new FileInputStream(file));
//            XSSFSheet myExcelSheet = myExcelBook.getSheet("Keyword");
//            XSSFRow row = myExcelSheet.getRow(0);
//
//            if (row.getCell(0).getCellType() == HSSFCell.CELL_TYPE_STRING) {
//                String name = row.getCell(0).getStringCellValue();
//                System.out.println("NAME : " + name);
//            }
//
//            if (row.getCell(1).getCellType() == HSSFCell.CELL_TYPE_NUMERIC) {
//                Date birthdate = row.getCell(1).getDateCellValue();
//                System.out.println("DOB :" + birthdate);
//            }
//        } catch (IOException e) {
//
//        } finally {
//
//        }
    }
    
    
    private static final String FILE_NAME = "C://Users//Kashif Alei//Desktop//demo.xlsx";

    public static void main(String[] args) {

        try {

            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet datatypeSheet = workbook.getSheetAt(0);
            Iterator<Row> iterator = datatypeSheet.iterator();

            while (iterator.hasNext()) {

                Row currentRow = iterator.next();
                Iterator<Cell> cellIterator = currentRow.iterator();
  
                int i = 0;
                while (cellIterator.hasNext()) {

                    Cell currentCell = cellIterator.next();
                    System.err.println(currentCell.getRow().getCell(i));
                    i++;

                }
                System.out.println();

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
