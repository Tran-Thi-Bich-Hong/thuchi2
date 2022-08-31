/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repository.impl;

import com.mycompany.pojo.TypeEarnings;
import com.mycompany.pojo.TypeExpenditures;
import com.mycompany.repository.TypeEarningRepository;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Administrator
 */
@Repository
@Transactional
public class TypeEarningRepositoryImpl implements TypeEarningRepository {
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    

    @Override
    public List<TypeEarnings> getTypeEarnings() {
        Session s = this.sessionFactory.getObject().getCurrentSession();
        Query q = s.createQuery("From TypeEarnings");
        return q.getResultList();
    }
    @Override
    public List<TypeExpenditures> getTypeExpenditures(){
        Session s = this.sessionFactory.getObject().getCurrentSession();
        Query q = s.createQuery("From TypeExpenditures");
        return q.getResultList();
    }
}
