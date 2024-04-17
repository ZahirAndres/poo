package mx.utng.s28.persistence;
/*
 * @autor Zahir Andres Rodriguez Mora
 * @category GDs 0622
 * @since 03/04/2024
*/

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import mx.utng.s28.model.Equipo;
import mx.utng.s28.model.Partido;

@SpringBootTest
@ComponentScan(basePackages = "mx.utng.s28")
@ExtendWith(SpringExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PartidoRepositoryTest {

    @Autowired
    private EquipoRepository equiporepo;
    @Autowired
    private PartidoRepository partidorepo;

    @BeforeAll
    void cleanDatabase(){
        partidorepo.deleteAll();
    }
    @Test
    void canSave(){
        Equipo equipo = new Equipo();
        Equipo equipo1 = new Equipo();

        equipo.setNombre("Real Madrid");
        equipo = equiporepo.save(equipo);
        equipo1.setNombre("Barcelona");
        equipo = equiporepo.save(equipo1);

        Partido partido = new Partido();
        partido.setEquipo1(equipo);
        partido.setEquipo2(equipo1);
        partido.setMarcadorEquipo1(6);
        partido.setMarcadorEquipo2(0);
        
        partido = partidorepo.save(partido);

        assertNotNull(partido.getId());
        assertNotEquals(0, partido.getId());


    }
    @Test
    @DisplayName("Buscar por id")
    void canFindById(){
        Long id = 1L;
        Partido partido = new Partido();
    }
    
}
