package project.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;
import project.model.Material;
import project.model.Pipe;
import project.model.Producer;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class PipeRepositoryTest {

    @Autowired
    private PipeRepository pipeRepository;
    @Autowired
    private MaterialRepository materialRepository;
    @Autowired
    private ProducerRepository producerRepository;

    @Test
//    @Sql(statements = {"INSERT INTO material (material_id, material_name)VALUES(3,'PP')"})
//    @Sql(statements = {"INSERT INTO PIPE (pipe_id, dimension, name, thickness)VALUES(1,'20,'PP 20', 2.3)"})
    void returnAllPipeFromMaterialName()
    {
        //given
        Optional<Producer> producer = producerRepository.findById(1L);
        Material material = new Material(3L,"PP");
        Pipe pipe = new Pipe(4L,20,"PP 25", (float) 2.3,material,producer.get());
        String materialName = "PP";
        materialRepository.save(material);
        pipeRepository.save(pipe);
        //when
        List<Object> pipes = pipeRepository.findAllPipeByMaterial(materialName);
        //then
        assertEquals(1,pipes.size());
    }

}