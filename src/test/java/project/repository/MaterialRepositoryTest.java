package project.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import project.model.Material;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class MaterialRepositoryTest {

    @Autowired
    private MaterialRepository materialRepository;

    @Test
    void shouldReturnMaterialByName(){
        //given
        //when
        Material result = materialRepository.findMaterialByName("PP-R");
        //then
        assertEquals("PP-R",result.getMaterialName());
    }

    @Test
    void shouldNotReturnMaterialByName(){
        //given
        //when
        Material result = materialRepository.findMaterialByName("ABCFEF");
        //then
        assertNull(result.getMaterialName());
    }

}