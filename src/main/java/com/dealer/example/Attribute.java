package com.dealer.example;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.rest.core.annotation.Description;

import javax.persistence.*;
import java.util.List;

/**
 * User: ddcrichak
 * Date: 9/22/14
 */
@Entity
public class Attribute {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;

    @Description("Vehicle Make")
    private String make;

    @Description("Vehicle Model")
    private String model;

    public String getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
