/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.books.dao;

import com.books.models.User;

/**
 *
 * @author Kashif Alei
 */
public interface UserDAO {

    public Integer registerUser(User user);
    
    public User loginUser(User user);
    
    public Boolean checkUsernameAvailbility(String username);
    
    public Boolean checkEmailAvailbility(String email);
    
    public Integer changePassword(User user);
}
