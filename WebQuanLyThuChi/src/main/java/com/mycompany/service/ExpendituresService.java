/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.service;


import com.mycompany.pojo.Expenditures;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Administrator
 */
public interface ExpendituresService {
   List <Expenditures> getExpenditure(Map<String, String> params, int page);
    boolean addExpenditures(Expenditures p);
   
}
