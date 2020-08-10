package project.repository;

import org.springframework.data.repository.CrudRepository;
import project.model.Pipe;
import org.springframework.stereotype.Repository;

@Repository
public interface PipeRepository extends CrudRepository<Pipe,Long> {
}
