/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formatters;


import com.mycompany.pojo.Earnings;
import java.sql.Date;
import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;

/**
 *
 * @author Administrator
 */
public class dateformatter implements Formatter<Earnings> {

   

    
    @Override
    public String print(Earnings t, Locale locale) {
        return String.valueOf(t.getCreateddate());
    }  
    @Override
    public Earnings parse(String d, Locale locale) throws ParseException {
        Earnings t = new Earnings();
        Date date = Date.valueOf(d);
        t.setCreateddate(date);
        return t;
    }
}
