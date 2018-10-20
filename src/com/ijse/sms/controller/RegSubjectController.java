/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.controller;

import com.ijse.sms.core.dto.RegSubjectDTO;
import com.ijse.sms.core.dto.SubjectDTO;
import com.ijse.sms.dao.DAOFactory;
import com.ijse.sms.dao.custom.RegSubjectDAO;
import java.util.ArrayList;

/**
 *
 * @author Chamini
 */
public class RegSubjectController {
  public static RegSubjectDAO regSubjectDAO=(RegSubjectDAO) DAOFactory.geInstatce().getDAO(DAOFactory.DAOTypes.RegSubject);
  
  public static ArrayList<RegSubjectDTO>getAllMedium() throws Exception{
    return regSubjectDAO.getAll();
}
  public static boolean add(RegSubjectDTO redister) throws Exception{
      boolean add = regSubjectDAO.add(redister);
      return add;
  }
  public  static RegSubjectDTO search(RegSubjectDTO regisubject) throws Exception{
        RegSubjectDTO search = regSubjectDAO.search(regisubject);
        return search;
  }

   
   public static ArrayList<SubjectDTO> eachSubjet(String id) throws Exception{
       return regSubjectDAO.eachSubject(id);
   }  
}
