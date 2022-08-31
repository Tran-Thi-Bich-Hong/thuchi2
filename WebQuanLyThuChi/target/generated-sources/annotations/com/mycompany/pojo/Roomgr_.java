package com.mycompany.pojo;

import com.mycompany.pojo.Acount;
import com.mycompany.pojo.JoinGr;
import com.mycompany.pojo.RoomIdea;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-31T00:06:11")
@StaticMetamodel(Roomgr.class)
public class Roomgr_ { 

    public static volatile SetAttribute<Roomgr, RoomIdea> roomIdeaSet;
    public static volatile SetAttribute<Roomgr, JoinGr> joinGrSet;
    public static volatile SingularAttribute<Roomgr, String> name;
    public static volatile SingularAttribute<Roomgr, Integer> id;
    public static volatile SingularAttribute<Roomgr, Acount> userId;

}