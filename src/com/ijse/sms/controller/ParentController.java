/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.controller;

import com.ijse.sms.core.dto.ParentDTO;
import com.ijse.sms.dao.DAOFactory;
import com.ijse.sms.dao.custom.ParentDAO;

/**
 *
 * @author Chamini
 */
public class ParentController {
    public static ParentDAO parentDAO=(ParentDAO) DAOFactory.geInstatce().getDAO(DAOFactory.DAOTypes.Parent);
    
    public static boolean addParent(ParentDTO parent) throws Exception{
        boolean add = parentDAO.add(parent);
        return add;
    }
    public static ParentDTO searchparent(ParentDTO dto) throws Exception{
        return parentDAO.search(dto);
    }
}
