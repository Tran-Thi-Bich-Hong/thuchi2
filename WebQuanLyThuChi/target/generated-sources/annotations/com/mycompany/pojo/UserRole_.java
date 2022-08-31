package com.mycompany.pojo;

import com.mycompany.pojo.Acount;
import com.mycompany.pojo.TypeUser;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-31T00:06:11")
@StaticMetamodel(UserRole.class)
public class UserRole_ { 

    public static volatile SetAttribute<UserRole, Acount> acountSet;
    public static volatile SingularAttribute<UserRole, String> name;
    public static volatile SingularAttribute<UserRole, Integer> id;
    public static volatile SetAttribute<UserRole, TypeUser> typeUserSet;

}