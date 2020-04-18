/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.books.models;

import java.util.Comparator;

/**
 *
 * @author Kashif Alei
 */
public class AnalysedData {

    private Integer analysedDataId;
    private String keyword;
    private String profitableBooks;
    private String analysisDate;

    public Integer getAnalysedDataId() {
        return analysedDataId;
    }

    public void setAnalysedDataId(Integer analysedDataId) {
        this.analysedDataId = analysedDataId;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getProfitableBooks() {
        return profitableBooks;
    }

    public void setProfitableBooks(String profitableBooks) {
        this.profitableBooks = profitableBooks;
    }

    public String getAnalysisDate() {
        return analysisDate;
    }

    public void setAnalysisDate(String analysisDate) {
        this.analysisDate = analysisDate;
    }
    
}
