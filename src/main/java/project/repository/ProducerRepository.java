package project.repository;

import org.springframework.data.repository.CrudRepository;
import project.model.Producer;


public interface ProducerRepository extends CrudRepository<Producer, Long> {
}
