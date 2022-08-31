package com.mycompany.pojo;

import com.mycompany.pojo.Acount;
import com.mycompany.pojo.Roomgr;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-31T00:06:11")
@StaticMetamodel(JoinGr.class)
public class JoinGr_ { 

    public static volatile SingularAttribute<JoinGr, Acount> acountId;
    public static volatile SingularAttribute<JoinGr, Integer> idJoinGroup;
    public static volatile SingularAttribute<JoinGr, Roomgr> groupId;

}