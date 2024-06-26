package mx.utng.s26.sesion26.model.dao;
import java.util.List;
import mx.utng.s26.sesion26.model.entity.Subjet;
/**
 * @autor Zahir Andres Rodriguez Mora
 * @category GDS0622
 * @size 19/3/2024
 */
public interface ISubjetDao {
    List<Subjet> list();
  void save(Subjet subjet);
  Subjet getById(Long id);
  void delete(Long id);
}
