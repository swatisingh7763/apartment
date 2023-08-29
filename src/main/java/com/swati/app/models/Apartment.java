package com.swati.app.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Data
@Entity
@Table
(name="apartment")
public class Apartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String type;
    private Long cost;
    @OneToMany(targetEntity = Address.class)
    private List<Address> addressList;
}
