package project.repository;

import org.springframework.data.repository.CrudRepository;
import project.model.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialRepository extends CrudRepository<Material, Long> {
}
