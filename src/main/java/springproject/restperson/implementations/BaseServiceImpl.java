package springproject.restperson.implementations;import org.springframework.beans.factory.annotation.Autowired;import springproject.restperson.models.entities.Base;import springproject.restperson.repositories.BaseRepository;import springproject.restperson.services.BaseService;import javax.transaction.Transactional;import java.io.Serializable;import java.util.List;public abstract class BaseServiceImpl<E extends Base, ID extends Serializable> implements BaseService<E, ID> {    @Autowired    protected BaseRepository<E, ID> baseRepository;    @Override    @Transactional    public List<E> select(String status) throws Exception {        try {            List<E> list = baseRepository.findByStatus(status);            return list;        } catch (Exception e) {            throw new Exception(e.getMessage());        }    }    @Override    @Transactional    public E get(ID id, String status) throws Exception {        try {            E entity = baseRepository.findByIdAndStatus(id, status);            return entity;        } catch (Exception e) {            throw new Exception(e.getMessage());        }    }    @Override    @Transactional    public E insert(E entity) throws Exception {        try {            entity.setStatus("ENABLED");            return baseRepository.save(entity);        } catch (Exception e) {            throw new Exception(e.getMessage());        }    }    @Override    public E delete(ID id) throws Exception {        try {            E entity = baseRepository.findById(id).orElse(null);            if (baseRepository.existsById(id)) {                entity.setStatus("DISABLED");                return baseRepository.save(entity);            } else {                throw new Exception();            }        } catch (Exception e) {            throw new Exception(e.getMessage());        }    }}