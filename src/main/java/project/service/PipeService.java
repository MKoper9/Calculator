package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.model.Pipe;
import project.repository.PipeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PipeService {

    private PipeRepository pipeRepository;

    @Autowired
    public PipeService(PipeRepository pipeRepository) {
        this.pipeRepository = pipeRepository;
    }

    public List<Pipe> getAllPipes(){
        return pipeRepository.findAll();
    }

    public Optional<Pipe> getPipeById(Long pipe_id){
        return pipeRepository.findById(pipe_id);
    }
}
