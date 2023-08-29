package com.swati.app.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String locality;
    private String city;
    private int pinCode;
}
