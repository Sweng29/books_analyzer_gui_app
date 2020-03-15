/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.books.daoimpl;

import com.books.business.MessageForm;
import com.books.connection.DBConnection;
import com.books.dao.GenericDAO;
import com.books.models.BookDetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Kashif Alei
 */
public class BookDetailDAOImpl implements GenericDAO<BookDetail>{

    private Connection connection;
    private ResultSet resultSet;
    private PreparedStatement ps;
    String pattern = "yyyy-MM-dd";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    
    @Override
    public Integer save(BookDetail entity) {
        String query = "INSERT INTO books_db.book_details\n" +
                       "(title, keyword, bsr, no_of_reviews, date_of_publication, price,created_date)\n" +
                       "VALUES(?, ?, ?, ?, ?, ?,?);";
        try{
            connection = DBConnection.getInstance();
            //String date = simpleDateFormat.format(entity.getDateOfPublication());
            ps = connection.prepareStatement(query);
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getKeyword());
            ps.setLong(3, entity.getBsr());
            ps.setInt(4, entity.getNoOfReviews());
            ps.setString(5, entity.getDateOfPublication());
            ps.setDouble(6, entity.getPrice());
            ps.setString(7, new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
            return ps.executeUpdate(); 
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public Integer update(BookDetail entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet findAll() {
        String query = "select\n"
                + "	bd.id as 'ID',\n"
                + "	bd.title as 'Title',\n"
                + "	bd.keyword as 'Keyword',\n"
                + "	bd.bsr as 'BSR',\n"
                + "	bd.no_of_reviews as 'No Of Reviews',\n"
                + "	bd.date_of_publication as 'Publication Date',\n"
                + "	bd.price as 'Price',\n"
                + "	bd.created_date as 'Loaded On'\n"
                + "from\n"
                + "	book_details bd where \n"
                +"	bd.created_date = curdate()\n"
                + "order by\n"
                + "	bd.created_date desc;";
        try{
            connection = DBConnection.getInstance();
            //String date = simpleDateFormat.format(entity.getDateOfPublication());
            ps = connection.prepareStatement(query);
            return ps.executeQuery();
            
        }catch(Exception e)
        {
            e.printStackTrace();
            new MessageForm("Error", e.toString(), "error.png").setVisible(true);
        }
        return null;
    }

    @Override
    public BookDetail findById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
//    select
//	bd.title as 'Keyword',
//	count(*) as 'Profitable books',curdate() as 'Analysis Date'
//from
//	book_details bd
//where
//	bd.bsr < 100000
//	and(
//		bd.no_of_reviews > 0
//		and bd.no_of_reviews < 100
//	)
//	and datediff(CURDATE(),bd.date_of_publication) > 30
//	and bd.price > 0
//group by
//	bd.title
//order by
//	count(*) desc;
    
    public ResultSet findAllAnalysedData(String date) {
        String query = "select\n"
                + "bd.id as 'ID',"
                + "	bd.keyword as 'Keyword',\n"
                + "	count(*) as 'Profitable books',curdate() as 'Analysis Date'\n"
                + "from\n"
                + "	book_details bd\n"
                + "where\n"
                + "	bd.bsr < 100000\n"
                + "	and(\n"
                + "		bd.no_of_reviews > 0\n"
                + "		and bd.no_of_reviews < 100\n"
                + "	)\n"
                + "	and datediff(CURDATE(),bd.date_of_publication) > 30\n"
                + "	and bd.price > 0\n"
                + "group by\n"
                + "	bd.title\n"
                + "order by\n"
                + "	count(*) desc;";
        try{
            connection = DBConnection.getInstance();
            //String date = simpleDateFormat.format(entity.getDateOfPublication());
            ps = connection.prepareStatement(query);
            return ps.executeQuery();
            
        }catch(Exception e)
        {
            e.printStackTrace();
            new MessageForm("Error", e.toString(), "error.png").setVisible(true);
        }
        return null;
    }
    
    public Integer deleteAll() {
        String query = "DELETE FROM book_details;";
        try{
            connection = DBConnection.getInstance();
            ps = connection.prepareStatement(query);
            ps.executeUpdate();
            return 1;
        }catch(Exception e)
        {
            e.printStackTrace();
            new MessageForm("Error", e.toString(), "error.png").setVisible(true);
        }
        return null;
    }
    
}
