package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import project.model.Material;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Long> {

    @Modifying
    @Query(value = "SELECT * FROM material WHERE material.material_name = :name")
    Material findMaterialByName(@Param("name") String materialName);
}
