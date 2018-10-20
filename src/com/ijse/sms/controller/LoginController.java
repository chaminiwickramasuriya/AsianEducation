/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.controller;

import com.ijse.sms.core.dto.LoginDTO;
import com.ijse.sms.dao.DAOFactory;
import com.ijse.sms.dao.custom.LogginDAO;
import java.util.ArrayList;

/**
 *
 * @author Chamini
 */
public class LoginController {
    public static LogginDAO loginDAO=(LogginDAO) DAOFactory.geInstatce().getDAO(DAOFactory.DAOTypes.Loggin);
    
    public static LoginDTO search(LoginDTO login) throws Exception{
        LoginDTO search = loginDAO.search(login);
        return search;
    }
    
    public static boolean update (LoginDTO login) throws Exception{
        boolean update = loginDAO.update(login);
        return update;
    }
    public static ArrayList<LoginDTO>getLogUse(String name) throws Exception{
        return loginDAO.getLogUser(name);
    }
     public static boolean getPassword(String name,String pass) throws Exception{
        boolean password = loginDAO.getPassword(name, pass);
        return password;
     }
}
