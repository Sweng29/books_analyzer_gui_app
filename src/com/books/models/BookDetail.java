/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.books.models;

/**
 *
 * @author Kashif Alei
 */
public class BookDetail {


    private Integer bookId;
    private String title;
    private String keyword;
    private Long bsr;
    private Integer noOfReviews;
    private String dateOfPublication;
    private Double price;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Long getBsr() {
        return bsr;
    }

    public void setBsr(Long bsr) {
        this.bsr = bsr;
    }

    public Integer getNoOfReviews() {
        return noOfReviews;
    }

    public void setNoOfReviews(Integer noOfReviews) {
        this.noOfReviews = noOfReviews;
    }

    public String getDateOfPublication() {
        return dateOfPublication;
    }

    public void setDateOfPublication(String dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookDetail{" + "bookId=" + bookId + ", title=" + title + ", keyword=" + keyword + ", bsr=" + bsr + ", noOfReviews=" + noOfReviews + ", dateOfPublication=" + dateOfPublication + ", price=" + price + '}';
    }
    
    
}
