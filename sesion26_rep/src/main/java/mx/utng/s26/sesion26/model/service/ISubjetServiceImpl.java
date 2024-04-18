package mx.utng.s26.sesion26.model.service;
/**
 * @autor Zahir Andres Rodriguez Mora
 * @category GDS0622
 * @size 19/3/2024
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mx.utng.s26.sesion26.model.dao.ISubjetDao; 
import mx.utng.s26.sesion26.model.entity.Subjet;

@Service
public class ISubjetServiceImpl implements ISubjetService{

    @Autowired
    private ISubjetDao dao;

    @Transactional(readOnly = true)
    @Override
    public List<Subjet> list() {
        return dao.list();
    }
    @Transactional
    @Override
    public void save(Subjet subjet) {
    dao.save(subjet);    
    }
    @Transactional(readOnly = true)
    @Override
    public Subjet getByID(Long id) {
        return dao.getById(id);
    }
    @Transactional
    @Override
    public void delete(Long id) {
        dao.delete(id);
    }
    
}
