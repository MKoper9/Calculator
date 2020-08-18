package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import project.model.Material;
import project.repository.MaterialRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class MaterialService {

    private MaterialRepository materialRepository;

    @Autowired
    public MaterialService(MaterialRepository materialRepository) {
        this.materialRepository = materialRepository;
    }

    public List<Material>getAllMaterials(){
        return materialRepository.findAll();
    }

    public Optional<Material> getMaterialById(Long material_id){
        return materialRepository.findById(material_id);
    }

    public Boolean updateMaterialData(Long material_id, String material_name)
    {
        Optional<Material> materialOpt = materialRepository.findById(material_id);
        if(materialOpt.isPresent()){
            Material material = materialOpt.get();
            material.setMaterialName(material_name);
            materialRepository.save(material);
            return true;
        }
        return false;
    }
}
