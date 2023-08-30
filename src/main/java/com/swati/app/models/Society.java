package com.swati.app.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "society")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Society {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @ManyToMany(targetEntity = Blocks.class)
    private List<Blocks> blocksList;
}
