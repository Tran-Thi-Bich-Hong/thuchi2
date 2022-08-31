/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controllers;

import com.mycompany.pojo.Earnings;
import com.mycompany.service.EarningService;
import com.mycompany.service.ExpendituresService;
import com.mycompany.service.GroupService;
import com.mycompany.service.TypeEarningService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Administrator
 */
@Controller
@ControllerAdvice
public class IndexController {
    @Autowired
    private TypeEarningService typeEarningService;
   
    @Autowired
    private EarningService earningService;
    @Autowired
    private ExpendituresService expendituresService;
    @Autowired
    private GroupService groupService;
    @ModelAttribute
    public void commonAttr(Model model) {
        model.addAttribute("typeEarnings", this.typeEarningService.getTypeEarnings());
        model.addAttribute("typeExpenditures", this.typeEarningService.getTypeExpenditures());
        
    } 
    @RequestMapping("/")
    public String index(Model model, @RequestParam Map<String, String> params){
        
        model.addAttribute("typeEarnings", this.typeEarningService.getTypeEarnings());
        model.addAttribute("typeExpenditures", this.typeEarningService.getTypeExpenditures());
        model.addAttribute("Earnings", this.earningService.getEarnings(params, 0));
        model.addAttribute("Expenditures", this.expendituresService.getExpenditure(params, 0));
        model.addAttribute("room", this.groupService.countUserInRoom());
        return "index";
    }
    
}
