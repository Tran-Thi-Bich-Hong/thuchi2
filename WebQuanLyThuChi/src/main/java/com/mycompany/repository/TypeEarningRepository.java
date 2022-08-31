/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.repository;

import com.mycompany.pojo.TypeEarnings;
import com.mycompany.pojo.TypeExpenditures;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface TypeEarningRepository {
     List<TypeEarnings> getTypeEarnings();
     List<TypeExpenditures> getTypeExpenditures();
}
