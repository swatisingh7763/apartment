package com.swati.app.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "blocks")
public class Blocks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int societyId;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Apartment> apartmentList;

}
