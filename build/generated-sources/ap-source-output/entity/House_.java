package entity;

import entity.Value;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-05T10:25:05")
@StaticMetamodel(House.class)
public class House_ { 

    public static volatile ListAttribute<House, Value> valueList;
    public static volatile SingularAttribute<House, String> location;
    public static volatile SingularAttribute<House, Integer> id;

}