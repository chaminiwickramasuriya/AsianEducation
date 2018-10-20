/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.dao.custom;

import com.ijse.sms.core.dto.LoginDTO;
import com.ijse.sms.dao.SuperDAO;
import java.util.ArrayList;

/**
 *
 * @author Chamini
 */
public interface LogginDAO extends SuperDAO<LoginDTO>{
     public ArrayList<LoginDTO>getLogUser(String name)throws Exception;
     public  boolean getPassword(String name,String pass)throws Exception;
}
