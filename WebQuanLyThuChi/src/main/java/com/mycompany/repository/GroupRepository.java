/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.repository;

import com.mycompany.pojo.Earnings;

import com.mycompany.pojo.Roomgr;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Administrator
 */
public interface GroupRepository {
    List <Roomgr> getGroup(Map<String, String> params);
    List <Object[]> countUserInRoom();
}
