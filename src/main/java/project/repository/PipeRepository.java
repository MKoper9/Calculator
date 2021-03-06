package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import project.model.Pipe;

import java.util.List;

@Repository
public interface PipeRepository extends JpaRepository<Pipe,Long> {


    @Query(value = "SELECT pipe.dimension, pipe.name, pipe.thickness, material.material_name FROM pipe JOIN material " +
            "ON(pipe.material_id = material.material_id) WHERE material.material_name = ?1,", nativeQuery = true)
    List<Object>findAllPipeByMaterial(String material);
}
