package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.model.Material;
import project.model.Pipe;
import project.model.Producer;
import project.repository.MaterialRepository;
import project.repository.PipeRepository;
import project.repository.ProducerRepository;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.List;
import java.util.Optional;

@Service
public class PipeService {

    private PipeRepository pipeRepository;
    private MaterialRepository materialRepository;
    private ProducerRepository producerRepository;

    @Autowired
    public PipeService(PipeRepository pipeRepository, MaterialRepository materialRepository,
                       ProducerRepository producerRepository) {
        this.pipeRepository = pipeRepository;
        this.materialRepository = materialRepository;
        this.producerRepository = producerRepository;
    }

    public List<Pipe> getAllPipes(){
        return pipeRepository.findAll();
    }

    public Optional<Pipe> getPipeById(Long pipe_id){
        return pipeRepository.findById(pipe_id);
    }

    public Boolean updatePipeById(Long pipeId, Integer dimension, String name, Float thickness,
                                  String materialName, String producerName){

        Optional<Pipe> pipeOpt = pipeRepository.findById(pipeId);

        if(pipeOpt.isPresent()){
            Pipe pipe = pipeOpt.get();

            pipe.setDimension(dimension);
            pipe.setName(name);
            pipe.setThickness(thickness);


            Material material =materialRepository.findMaterialByName(materialName);


        }

    }


}
