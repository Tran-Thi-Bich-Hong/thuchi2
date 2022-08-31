/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controllers;

import com.mycompany.pojo.Earnings;
import com.mycompany.pojo.Expenditures;
import com.mycompany.service.EarningService;
import com.mycompany.service.ExpendituresService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Administrator
 */
@RestController
@RequestMapping("/api")
public class APIEarningController {
    @Autowired
    private EarningService earningService;
    @Autowired
    private ExpendituresService expendituresService;
    @GetMapping("/earning")
    public ResponseEntity<List<Earnings>> getEarnings() {
        return new ResponseEntity<>(this.earningService.getEarnings(null, 0), HttpStatus.OK);
    }
    @GetMapping("/Expenditures")
    public ResponseEntity<List<Expenditures>> getExpenditure() {
        return new ResponseEntity<>(this.expendituresService.getExpenditure(null, 0), HttpStatus.OK);
    }
}
