package mx.utng.s26.sesion26.model.dao;
/**
 * @autor Zahir Andres Rodriguez Mora
 * @category GDS0622
 * @size 19/3/2024
 */
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import mx.utng.s26.sesion26.model.entity.Building;

@Repository
public class IBuildingDaoImpl implements IBuildingDao {
    @Autowired
private EntityManager em;


    @Override
    public List<Building> list() {
        
        return em.createQuery("from Building", Building.class).getResultList();
    }
    @Override
    public void save(Building building) {
        if(building.getId()!= null && building.getId()>0){

            em.merge(building);
        }else{
            em.persist(building);
        }
        
    }
    @Override
    public Building getById(Long id) {
        return em.find(Building.class, id);
    }
    @Override
    public void delete(Long id) {
        Building building = getById(id);
        em.remove(building);
    }
    
}
