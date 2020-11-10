package springproject.restperson.controllers.base;import org.springframework.http.ResponseEntity;import org.springframework.web.bind.annotation.PathVariable;import org.springframework.web.bind.annotation.RequestBody;import springproject.restperson.models.entities.Base;import java.io.Serializable;public interface BaseController<E extends Base, ID extends Serializable> {    ResponseEntity<?> select();    ResponseEntity<?> get(@PathVariable ID id);    ResponseEntity<?> insert(@RequestBody E entity);    ResponseEntity<?> update(@PathVariable ID id, @RequestBody E entity);    ResponseEntity<?> delete(@PathVariable ID id);}