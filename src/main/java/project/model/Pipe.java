package project.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Pipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "pipe_id")
    private Long pipeId;
    private Integer dimension;
    private String name;
    private Float thickness;

    @ManyToOne
    @JoinColumn(name = "materialId")
    private Material material;

    @ManyToOne
    @JoinColumn(name = "producerId")
    private Producer producer;


}
