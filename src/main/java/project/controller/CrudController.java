package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.model.Material;
import project.model.Pipe;
import project.model.Producer;
import project.service.MaterialService;
import project.service.PipeService;
import project.service.ProducerService;

import javax.persistence.Column;
import java.util.List;
import java.util.Optional;

@RestController
public class CrudController {

    private PipeService pipeService;
    private ProducerService producerService;
    private MaterialService materialService;


    @Autowired
    public CrudController(PipeService pipeService, ProducerService producerService, MaterialService materialService) {
        this.pipeService = pipeService;
        this.producerService = producerService;
        this.materialService = materialService;
    }

    @GetMapping("/pipes")
    public List<Pipe> getAllPipes(){
        return pipeService.getAllPipes();
    }

    @GetMapping("/pipes/id={pipe_id}")
    public Optional<Pipe> getPipeById(@PathVariable("pipe_id") Long pipe_id){
        return pipeService.getPipeById(pipe_id);
    }

    @GetMapping("/producers")
    public List<Producer>getAllProducers(){
        return producerService.getAllProducer();
    }

    @GetMapping("producers/id={producer_id}")
    public Optional<Producer> getProducerBuId(@PathVariable("producer_id")Long producer_id){
        return producerService.getProducerById(producer_id);
    }

    @GetMapping("/materials")
    public List<Material>getAllMaterials(){
        return materialService.getAllMaterials();
    }

    @GetMapping("/materlais/id={material_id}")
    public Optional<Material> getMaterialById(@PathVariable("mateial_id") Long material_id)
    {
        return materialService.getMaterialById(material_id);
    }

    @PutMapping("updatePipe")
    public Boolean updatePipeById(@RequestParam Long pipeId,Integer dimension, String name, Float thickness){
        return pipeService.updatePipeById(pipeId,dimension,name,thickness);
    }


}
