package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.model.Material;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Long> {
}
