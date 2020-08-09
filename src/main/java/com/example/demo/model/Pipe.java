package com.example.demo.model;


import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
public class Pipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long pipeId;
    private Integer dimension;
    private Float thickness;
    private String name;

}
