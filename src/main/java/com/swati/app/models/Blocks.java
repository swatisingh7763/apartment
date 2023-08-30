package com.swati.app.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "blocks")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Blocks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String blockName;
    @ManyToMany(targetEntity = Apartment.class)
    private List<Apartment> apartmentList;
}
