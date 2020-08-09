package project.repository;

import project.model.Pipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PipeRepository extends JpaRepository<Pipe,Long> {
}
