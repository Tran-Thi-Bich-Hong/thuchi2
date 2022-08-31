/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controllers;

import com.mycompany.pojo.Earnings;
import com.mycompany.pojo.Roomgr;

import com.mycompany.service.EarningService;
import com.mycompany.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Administrator
 */
@Controller
@RequestMapping("/")
public class GroupController {
    @Autowired
    private EarningService earningService;
    @Autowired
    private GroupService groupService;
    @GetMapping("/Group")
    public String list(Model model) {
        model.addAttribute("group", new Roomgr());
        
        return "group";
    }
    
}
