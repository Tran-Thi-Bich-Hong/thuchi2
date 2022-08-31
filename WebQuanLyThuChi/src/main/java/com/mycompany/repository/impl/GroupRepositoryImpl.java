/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repository.impl;

import com.mycompany.pojo.Earnings;
import com.mycompany.pojo.Expenditures;
import com.mycompany.pojo.JoinGr;

import com.mycompany.pojo.Roomgr;
import com.mycompany.pojo.TypeExpenditures;
import com.mycompany.repository.GroupRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Administrator
 */
@Repository
@PropertySource("classpath:databases.properties")
@Transactional
public class GroupRepositoryImpl implements GroupRepository{
    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Autowired
    private Environment env;
    @Override
    public List<Roomgr> getGroup(Map<String, String> params) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder b = session.getCriteriaBuilder();
        CriteriaQuery<Roomgr> q = b.createQuery(Roomgr.class);
        Root root = q.from(Roomgr.class);
        q.select(root);
        if(params!=null){
            List<Predicate> predicates = new ArrayList<>();
            String kw = params.get("kw");
            if (kw != null && !kw.isEmpty()) {
                Predicate p = b.like(root.get("name").as(String.class), String.format("%%%s%%", kw));
                predicates.add(p);
            }
            q.where(predicates.toArray(Predicate[]::new));
        }
        Query query = session.createQuery(q);
        return query.getResultList();
    }

    @Override
    public List<Object[]> countUserInRoom() {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder b = session.getCriteriaBuilder();
        CriteriaQuery<Object[]> q = b.createQuery(Object[].class);
        
        Root rE = q.from(JoinGr.class);
        Root rTE = q.from(Roomgr.class);
        q.where(b.equal(rE.get("groupId"), rTE.get("id")));
        q.multiselect(rTE.get("id"), rTE.get("name"), b.count(rE.get("acountId")));
        q.groupBy(rTE.get("id"));
        Query query = session.createQuery(q);
        return query.getResultList();
    }
}
    
