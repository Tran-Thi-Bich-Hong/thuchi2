package com.mycompany.pojo;

import com.mycompany.pojo.UserRole;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-31T00:06:11")
@StaticMetamodel(TypeUser.class)
public class TypeUser_ { 

    public static volatile SingularAttribute<TypeUser, String> name;
    public static volatile SingularAttribute<TypeUser, Integer> id;
    public static volatile SingularAttribute<TypeUser, UserRole> userRoleId;

}