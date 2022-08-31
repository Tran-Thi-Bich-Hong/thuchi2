package com.mycompany.pojo;

import com.mycompany.pojo.Acount;
import com.mycompany.pojo.RoomIdea;
import com.mycompany.pojo.TypeExpenditures;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-31T00:06:11")
@StaticMetamodel(Expenditures.class)
public class Expenditures_ { 

    public static volatile SingularAttribute<Expenditures, String> note;
    public static volatile SingularAttribute<Expenditures, Date> createdDate;
    public static volatile SetAttribute<Expenditures, RoomIdea> roomIdeaSet;
    public static volatile SingularAttribute<Expenditures, Long> totalMoney;
    public static volatile SingularAttribute<Expenditures, Integer> id;
    public static volatile SingularAttribute<Expenditures, TypeExpenditures> typeExpenditureId;
    public static volatile SingularAttribute<Expenditures, Acount> userid;

}