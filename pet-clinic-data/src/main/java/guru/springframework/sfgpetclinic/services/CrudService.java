package guru.springframework.sfgpetclinic.services;


import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface CrudService<T, ID>{

    Set<T> findAll();

    T findById(ID id);

    T save(T entity);

    T deleteById(ID id);




}
