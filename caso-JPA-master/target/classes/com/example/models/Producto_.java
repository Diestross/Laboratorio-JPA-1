package com.example.models;

import com.example.models.Competitor;
import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-11-02T20:10:00")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, Calendar> createdAt;
    public static volatile SingularAttribute<Producto, Double> price;
    public static volatile SingularAttribute<Producto, Competitor> competitor;
    public static volatile SingularAttribute<Producto, String> name;
    public static volatile SingularAttribute<Producto, String> description;
    public static volatile SingularAttribute<Producto, Long> id;
    public static volatile SingularAttribute<Producto, Calendar> updatedAt;

}