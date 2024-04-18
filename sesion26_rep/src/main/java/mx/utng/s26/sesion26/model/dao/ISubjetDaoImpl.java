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
import mx.utng.s26.sesion26.model.entity.Subjet;

@Repository
public class ISubjetDaoImpl implements ISubjetDao {
    @Autowired
private EntityManager em;


    
    @Override
    public List<Subjet> list() {
        
        return em.createQuery("from Subjet", Subjet.class).getResultList();
    }
    @Override
    public void save(Subjet subjet) {
        if(subjet.getId()!= null && subjet.getId()>0){

            em.merge(subjet);
        }else{
            em.persist(subjet);
        }
        
    }
    @Override
    public Subjet getById(Long id) {
        return em.find(Subjet.class, id);
    }
    @Override
    public void delete(Long id) {
        Subjet subjet = getById(id);
        em.remove(subjet);
    }
    
}
