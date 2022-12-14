/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repository.impl;


import com.mycompany.pojo.Expenditures;
import com.mycompany.pojo.TypeEarnings;
import com.mycompany.pojo.TypeExpenditures;
import com.mycompany.repository.ExpenditureRepository;
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
public class ExpenditureRepositoryImpl implements ExpenditureRepository {
    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Autowired
    private Environment env;
    @Override
    public List <Expenditures> getExpenditure(Map<String, String> params, int page) {
       Session session = this.sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder b = session.getCriteriaBuilder();
        CriteriaQuery<Expenditures> q = b.createQuery(Expenditures.class);
        Root root = q.from(Expenditures.class);
        q.select(root);
        if(params!=null){
            List<Predicate> predicates = new ArrayList<>();
            String kw = params.get("kw");
            if (kw != null && !kw.isEmpty()) {
                Predicate p = b.like(root.get("note").as(String.class), String.format("%%%s%%", kw));
                predicates.add(p);
            }

//       

            String typeId = params.get("typeId");
            if (typeId != null) {
                Predicate p = b.equal(root.get("typeExpenditureId"), Integer.parseInt(typeId));
                predicates.add(p);
            }

            q.where(predicates.toArray(Predicate[]::new));
    
        }
        Query query = session.createQuery(q);
        if (page > 0) {
            int size = Integer.parseInt(env.getProperty("page.size").toString());
            int start = (page - 1) * size;
            query.setFirstResult(start);
            query.setMaxResults(size);

        }

        return query.getResultList();
    }

//    @Override
//    public int countProduct() {
//        Session session = this.sessionFactory.getObject().getCurrentSession();
//        Query q = session.createQuery("SELECT COUNT(*) FROM Product");
//
//        return Integer.parseInt(q.getSingleResult().toString());
//    }
    @Override
    public boolean addExpenditures(Expenditures p) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
            
        try {
            session.save(p);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
   

    
   
}
