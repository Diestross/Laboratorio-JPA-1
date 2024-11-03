package com.example.models;

import com.example.models.Producto;
import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-11-02T20:10:00")
@StaticMetamodel(Competitor.class)
public class Competitor_ { 

    public static volatile SingularAttribute<Competitor, String> country;
    public static volatile SingularAttribute<Competitor, String> address;
    public static volatile SingularAttribute<Competitor, String> city;
    public static volatile SingularAttribute<Competitor, String> telephone;
    public static volatile SetAttribute<Competitor, Producto> products;
    public static volatile SingularAttribute<Competitor, Calendar> createdAt;
    public static volatile SingularAttribute<Competitor, Boolean> winner;
    public static volatile SingularAttribute<Competitor, String> surname;
    public static volatile SingularAttribute<Competitor, String> name;
    public static volatile SingularAttribute<Competitor, String> cellphone;
    public static volatile SingularAttribute<Competitor, Long> id;
    public static volatile SingularAttribute<Competitor, Integer> age;
    public static volatile SingularAttribute<Competitor, Calendar> updatedAt;

}