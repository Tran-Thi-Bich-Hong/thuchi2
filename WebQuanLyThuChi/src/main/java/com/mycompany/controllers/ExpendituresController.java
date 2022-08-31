/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controllers;


import com.mycompany.pojo.Earnings;
import com.mycompany.pojo.Expenditures;
import com.mycompany.service.ExpendituresService;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Administrator
 */
@Controller
@RequestMapping("/")
public class ExpendituresController {
    @Autowired
    private ExpendituresService expendituresService;
    @GetMapping("/Expenditures")
    public String list(Model model) {
        model.addAttribute("expenditures", new Expenditures());
        return "expenditures";
    }
    @PostMapping("/Expenditures")
    public String add(@ModelAttribute(value = "expenditures") @Valid Expenditures p,
            BindingResult r) {
        if (r.hasErrors()) {
            return "expenditures";
        }
        if (this.expendituresService.addExpenditures(p) == true)
            return "redirect:/Expenditures";
        
        return "expenditures";
        
        
    }
   
}
