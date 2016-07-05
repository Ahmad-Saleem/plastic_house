package entity;

import entity.House;
import entity.Measure;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-05T10:25:05")
@StaticMetamodel(Value.class)
public class Value_ { 

    public static volatile SingularAttribute<Value, Measure> measureID;
    public static volatile SingularAttribute<Value, House> houseID;
    public static volatile SingularAttribute<Value, Integer> id;
    public static volatile SingularAttribute<Value, Double> threshold1;
    public static volatile SingularAttribute<Value, String> value;
    public static volatile SingularAttribute<Value, Double> threshold2;

}