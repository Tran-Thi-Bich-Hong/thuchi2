/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.pojo.Expenditures;
import com.mycompany.repository.ExpenditureRepository;
import com.mycompany.service.ExpendituresService;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrator
 */
@Service
public class ExpendituresServiceImpl implements ExpendituresService{
    @Autowired
    private ExpenditureRepository expenditureRepository;

    @Override
    public List <Expenditures> getExpenditure(Map<String, String> params, int page) {
       return this.expenditureRepository.getExpenditure(params, page);
    }

    @Override
    public boolean addExpenditures(Expenditures p) {
        Date date = new Date();
        p.setCreatedDate(date);
       return this.expenditureRepository.addExpenditures(p);
    }
  
   
}
