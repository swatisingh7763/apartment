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
    private int id;
    private String name;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Address> addressList;
}
