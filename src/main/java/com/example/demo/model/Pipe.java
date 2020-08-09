package com.example.demo.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Pipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long pipeId;
    private Integer dimension;
    private Float thickness;
    private String name;


    @ManyToOne
    @JoinColumn(name = "producerId")
    private Producer producer;

    @ManyToOne
    @JoinColumn(name = "materialId")
    private Material material;

}
