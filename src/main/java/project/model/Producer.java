package project.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
public class Producer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "producer_id")
    private Long producerId;
    @Column(name = "producer_name")
    private String producerName;


}
