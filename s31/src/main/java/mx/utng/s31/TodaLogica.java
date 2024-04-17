package mx.utng.s31;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//sirve para guardar, usado como controlador
@RestController
@RequestMapping("/casa")
public class TodaLogica {
    private final CasaRepository repository;

    @Autowired
    public TodaLogica(CasaRepository repository){
        this.repository = repository;
    }

    //Metodo para guardar la casa
//decorarlo con anotaciones
@RequestMapping(value = "",method = RequestMethod.POST)
   
public void guardarCasa(@RequestBody Casa casa){
        if(casa.getJefeFamilia()==null){
            throw new RuntimeException("Se requiere un jefe de familia");
        }
        casa.setJefeFamilia(casa.getJefeFamilia().toUpperCase());//"toUpperCase() pasa todo a mayuscula"
        ArrayList<String> otrosMayusculas = new ArrayList<>();

        for (String integrante : casa.getOtros()) {
            otrosMayusculas.add(integrante.toUpperCase());
        }

        casa.setOtros(otrosMayusculas);
        repository.save(casa);
    }
@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Casa getCasa(@PathVariable String id){
        Long idInt = Long.parseLong(id);
        return repository.findById(idInt).get();

    }
}
