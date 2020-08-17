package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.model.Producer;


public interface ProducerRepository extends JpaRepository<Producer, Long> {

}