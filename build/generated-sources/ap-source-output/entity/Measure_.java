package entity;

import entity.Value;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-05T10:25:05")
@StaticMetamodel(Measure.class)
public class Measure_ { 

    public static volatile SingularAttribute<Measure, String> unit;
    public static volatile ListAttribute<Measure, Value> valueList;
    public static volatile SingularAttribute<Measure, String> name;
    public static volatile SingularAttribute<Measure, Integer> id;

}