/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.pojo.Earnings;
import com.mycompany.repository.EarningRepository;
import com.mycompany.service.EarningService;
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
public class EarningServiceImpl implements EarningService {
    @Autowired
    private EarningRepository earningRepository;

    @Override
    public List<Earnings> getEarnings(Map<String, String> params, int page) {
       return this.earningRepository.getEarnings(params, page);
    }

    @Override
    public boolean addEarning(Earnings p) {
        Date date = new Date();
        p.setCreateddate(date);
       return this.earningRepository.addEarning(p);
    }
    public List <Object[]> EarningStats(){
        return this.earningRepository.EarningStats();
    }

    @Override
    public List<Object[]> ExpendituresStats() {
        return this.earningRepository.ExpendituresStats();
    }
    
}
