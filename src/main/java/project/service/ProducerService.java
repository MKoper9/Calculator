package project.service;

import org.springframework.stereotype.Service;
import project.model.Producer;
import project.repository.ProducerRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProducerService {

    private ProducerRepository producerRepository;

    public ProducerService(ProducerRepository producerRepository) {
        this.producerRepository = producerRepository;
    }

    public List<Producer>getAllProducer(){
        return producerRepository.findAll();
    }

    public Optional<Producer> getProducerById(Long producer_id){
        return producerRepository.findById(producer_id);
    }

}
