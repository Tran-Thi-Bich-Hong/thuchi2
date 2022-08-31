/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formatters;

import com.mycompany.pojo.TypeEarnings;
import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;

/**
 *
 * @author Administrator
 */
public class typeEarningFormatter implements Formatter<TypeEarnings> {

    @Override
    public String print(TypeEarnings t, Locale locale) {
        return String.valueOf(t.getId());
    }

    @Override
    public TypeEarnings parse(String id, Locale locale) throws ParseException {
        TypeEarnings t = new TypeEarnings();
        t.setId(Integer.parseInt(id));
        
        return t;
    }
    
}
