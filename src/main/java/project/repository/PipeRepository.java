package project.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import project.model.Pipe;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PipeRepository extends CrudRepository<Pipe,Long> {


    @Query(value = "SELECT pipe.dimension, pipe.name, pipe.thickness, material.material_name FROM pipe JOIN material " +
            "ON(pipe.material_id = material.material_id) WHERE material.material_name = :material", nativeQuery = true)
    List<Object>findAllPipeByMaterial(@Param("material")String material);
}
