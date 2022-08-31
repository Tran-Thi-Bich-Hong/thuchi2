/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.pojo.TypeEarnings;
import com.mycompany.pojo.TypeExpenditures;
import com.mycompany.repository.TypeEarningRepository;
import com.mycompany.service.TypeEarningService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrator
 */
@Service
public class TypeEarningServiceImpl implements TypeEarningService{
    @Autowired
    private TypeEarningRepository typeEarningRepository;
    

    @Override
    public List<TypeEarnings> getTypeEarnings() {
        return this.typeEarningRepository.getTypeEarnings();
    }

    @Override
    public List<TypeExpenditures> getTypeExpenditures() {
        return this.typeEarningRepository.getTypeExpenditures();
    }
}
