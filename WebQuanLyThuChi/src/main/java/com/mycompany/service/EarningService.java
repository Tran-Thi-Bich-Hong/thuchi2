/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.service;

import com.mycompany.pojo.Earnings;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Administrator
 */
public interface EarningService {
    List <Earnings> getEarnings(Map<String, String> params, int page);
    boolean addEarning(Earnings p);
    List <Object[]> EarningStats();
    List <Object[]> ExpendituresStats();
}
