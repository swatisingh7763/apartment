package com.swati.app.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "society")
public class Society {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToMany(targetEntity = Blocks.class)
    private List<Blocks> blocksList;
}
