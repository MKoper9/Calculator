package project.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "material_id")
    private Long materialId;
    @Column(name = "material_name")
    private String materialName;
}
