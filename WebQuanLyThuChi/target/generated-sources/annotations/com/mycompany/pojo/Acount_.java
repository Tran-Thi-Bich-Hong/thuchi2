package com.mycompany.pojo;

import com.mycompany.pojo.Earnings;
import com.mycompany.pojo.Expenditures;
import com.mycompany.pojo.Gender;
import com.mycompany.pojo.JoinGr;
import com.mycompany.pojo.Roomgr;
import com.mycompany.pojo.UserRole;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-31T00:06:11")
@StaticMetamodel(Acount.class)
public class Acount_ { 

    public static volatile SingularAttribute<Acount, String> gmail;
    public static volatile SingularAttribute<Acount, String> passWord;
    public static volatile SetAttribute<Acount, Earnings> earningsSet;
    public static volatile SetAttribute<Acount, JoinGr> joinGrSet;
    public static volatile SingularAttribute<Acount, String> nameperson;
    public static volatile SingularAttribute<Acount, String> phone;
    public static volatile SingularAttribute<Acount, Gender> genderId;
    public static volatile SetAttribute<Acount, Expenditures> expendituresSet;
    public static volatile SingularAttribute<Acount, Integer> id;
    public static volatile SingularAttribute<Acount, UserRole> userRoleId;
    public static volatile SingularAttribute<Acount, String> userName;
    public static volatile SetAttribute<Acount, Roomgr> roomgrSet;

}