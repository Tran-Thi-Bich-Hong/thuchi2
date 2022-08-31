package com.mycompany.pojo;

import com.mycompany.pojo.Acount;
import com.mycompany.pojo.RoomIdea;
import com.mycompany.pojo.TypeEarnings;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-31T00:06:11")
@StaticMetamodel(Earnings.class)
public class Earnings_ { 

    public static volatile SingularAttribute<Earnings, String> note;
    public static volatile SingularAttribute<Earnings, Acount> acountCreated;
    public static volatile SingularAttribute<Earnings, TypeEarnings> typeEarningId;
    public static volatile SetAttribute<Earnings, RoomIdea> roomIdeaSet;
    public static volatile SingularAttribute<Earnings, Date> createddate;
    public static volatile SingularAttribute<Earnings, Long> totalMoney;
    public static volatile SingularAttribute<Earnings, Integer> id;

}