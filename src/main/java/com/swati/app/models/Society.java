package com.swati.app.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "society")
public class Society {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String type;
    private Long cost;
}
