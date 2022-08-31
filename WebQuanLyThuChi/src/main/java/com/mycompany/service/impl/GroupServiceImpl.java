/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.pojo.Roomgr;
import com.mycompany.repository.GroupRepository;
import com.mycompany.service.GroupService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrator
 */
@Service
public class GroupServiceImpl implements GroupService {
 @Autowired
    private GroupRepository groupRepository;
    @Override
    public List<Roomgr> getGroup(Map<String, String> params) {
        return this.groupRepository.getGroup(params);
    }

    @Override
    public List<Object[]> countUserInRoom() {
        return this.groupRepository.countUserInRoom();
    }

}
