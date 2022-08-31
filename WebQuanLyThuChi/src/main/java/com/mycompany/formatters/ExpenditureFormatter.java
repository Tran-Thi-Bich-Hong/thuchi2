/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formatters;

import com.mycompany.pojo.TypeExpenditures;
import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;

/**
 *
 * @author Administrator
 */
public class ExpenditureFormatter implements Formatter<TypeExpenditures> {
    @Override
    public String print(TypeExpenditures t, Locale locale) {
        return String.valueOf(t.getId());
    }

    @Override
    public TypeExpenditures parse(String id, Locale locale) throws ParseException {
        TypeExpenditures t = new TypeExpenditures();
        t.setId(Integer.parseInt(id));
        
        return t;
    } 
}
