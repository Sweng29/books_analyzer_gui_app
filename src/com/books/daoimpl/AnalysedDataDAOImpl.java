/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.books.daoimpl;

import com.books.business.MessageForm;
import com.books.connection.DBConnection;
import com.books.dao.GenericDAO;
import com.books.models.AnalysedData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Kashif Alei
 */
public class AnalysedDataDAOImpl implements GenericDAO<AnalysedData>{

    private Connection connection;
    private ResultSet resultSet;
    private PreparedStatement ps;
    
    @Override
    public Integer save(AnalysedData entity) {
       String query = "INSERT INTO books_db.analysed_records\n"
                + "(keyword, analysis_date, created_date, profitable_book)\n"
                + "VALUES(?, ?, ?, ?);";
        try{
            connection = DBConnection.getInstance();
            ps = connection.prepareStatement(query);
            ps.setString(1, entity.getKeyword());
            ps.setString(2, entity.getAnalysisDate());
            ps.setString(3, new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
            ps.setString(4, entity.getProfitableBooks());
            return ps.executeUpdate(); 
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public Integer update(AnalysedData entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet findAll() {
        String query = "select\n"
                + "	ar.analysed_data_id as 'ID',\n"
                + "	ar.keyword as 'Keyword',\n"
                + "	ar.profitable_book as 'Profitable Book',\n"
                + "	ar.created_date as 'Analysis Date'\n"
                + "from\n"
                + "	analysed_records ar\n";
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
    public AnalysedData findById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ResultSet findAllByAnalysisDate(String date) {
         String query = "select\n"
                + "	ar.analysed_data_id as 'ID',\n"
                + "	ar.keyword as 'Keyword',\n"
                + "	ar.profitable_book as 'Profitable Book',\n"
                + "	ar.created_date as 'Analysis Date'\n"
                + "from\n"
                + "	analysed_records ar\n"
                + "where\n"
                + "	ar.created_date like '%"+date+"%';";
        System.out.println(date);
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

    public Integer deleteByDate(String date) {
        String query = "DELETE "
                + "from\n"
                + "	analysed_records ar\n"
                + "where\n"
                + "	ar.created_date like '%"+date+"%';";
        System.out.println(date);
        try{
            connection = DBConnection.getInstance();
            //String date = simpleDateFormat.format(entity.getDateOfPublication());
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
    
    public Integer deleteAllPreviousRecords() {
        String query = "DELETE "
                + "from\n"
                + "	analysed_records \n";
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
