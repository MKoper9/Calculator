package project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.GeneratedValue;
import javax.persistence.Id;


public class Result {

    private Integer diameter;
    private Double thickness;
    private Double stream;
    private Double speed;

    public Result(Integer diameter, Double thickness, Double stream) {

        if(diameter<2*thickness)
        {

        }
        this.diameter = diameter;
        this.thickness = thickness;
        this.stream = stream;
    }
}
