/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controllers;

import com.mycompany.pojo.Earnings;
import com.mycompany.service.EarningService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Administrator
 */
@Controller
@RequestMapping("/")
public class EarningController {
    @Autowired
    private EarningService earningService;
    @GetMapping("/earning")
    public String list(Model model) {
        model.addAttribute("earning", new Earnings());
        return "earning";
    }
    @PostMapping("/earning")
    public String add(@ModelAttribute(value = "earning") @Valid Earnings p,
            BindingResult r) {
        if (r.hasErrors()) {
            return "earning";
        }
        if (this.earningService.addEarning(p) == true)
            return "redirect:/earning";
        
        return "earning";
        
        
    }
    @GetMapping("/Stats")
    public String EarningStats (Model model) {
        model.addAttribute("statsEarning", this.earningService.EarningStats());
        model.addAttribute("statsExpenditures", this.earningService.ExpendituresStats());
        return "Stats";
    }
    
}
