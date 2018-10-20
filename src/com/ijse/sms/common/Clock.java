/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.common;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

/**
 *
 * @author Tharaka
 */
public class Clock extends JLabel implements ActionListener{
    String type;
    SimpleDateFormat sdf;

    public Clock(String type) {
        this.type=type;
        switch(type){
            case "date":
                sdf=new SimpleDateFormat("yyyy/MM/dd");
                setFont(new Font("", 1, 15));
                setHorizontalAlignment(SwingConstants.RIGHT);
                break;
            case "time":
                sdf=new SimpleDateFormat("hh:mm a");
                setFont(new Font("", 1, 30));
                setHorizontalAlignment(SwingConstants.RIGHT);
                break;
            case "day":
                sdf=new SimpleDateFormat("EEEE");
                setFont(new Font("", 1, 15));
                setHorizontalAlignment(SwingConstants.RIGHT);
                break;
            case "second":
                sdf=new SimpleDateFormat("hh.mm.ss aa");
                setFont(new Font("", 1, 25));
                setHorizontalAlignment(SwingConstants.RIGHT);
                break;
            default:
                sdf=new SimpleDateFormat();
                break;
        }
        Timer t=new Timer(1000, this);
        t.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Date d=new Date();
        setText(sdf.format(d)); //To change body of generated methods, choose Tools | Templates.
    }
            
}
