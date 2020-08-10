package project.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class ProducerRepositoryTest {

    @Autowired
    private ProducerRepository producerRepository;

    @Test
    @Sql(statements = {"INSERT INTO producer (producerId, producerName)"})
    void shouldFindProducerById(){

    }

}