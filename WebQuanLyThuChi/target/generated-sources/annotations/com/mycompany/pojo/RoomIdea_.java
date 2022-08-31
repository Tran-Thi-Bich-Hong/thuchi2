package com.mycompany.pojo;

import com.mycompany.pojo.Earnings;
import com.mycompany.pojo.Expenditures;
import com.mycompany.pojo.Roomgr;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-31T00:06:11")
@StaticMetamodel(RoomIdea.class)
public class RoomIdea_ { 

    public static volatile SingularAttribute<RoomIdea, Earnings> eaningIdeaId;
    public static volatile SingularAttribute<RoomIdea, Integer> earningStatus;
    public static volatile SingularAttribute<RoomIdea, Integer> id;
    public static volatile SingularAttribute<RoomIdea, Roomgr> roomId;
    public static volatile SingularAttribute<RoomIdea, Integer> expendituresStatus;
    public static volatile SingularAttribute<RoomIdea, Expenditures> expendituresIdeaId;

}