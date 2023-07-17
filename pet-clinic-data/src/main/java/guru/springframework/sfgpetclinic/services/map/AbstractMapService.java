package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.BaseEntity;

import java.util.*;

//Creo quindi una struttura chiave-valore dove inserire i parametri appropriati
//abbiamo usato i generic e tutto è coerente con le classi che lo implementano
public abstract class AbstractMapService<T extends BaseEntity,ID extends  Long> {

    protected Map<Long,T> map=new HashMap<>();


    Set<T> findAll(){

        return new HashSet<>(map.values());
    }
    T findById(ID id){

        return map.get(id);
    }
    //Save by id ,entity NOTA BENE CHE L'ORDINE dei parametri nella dichiarazione del metodo, vanno rispettati anche
    //quando poi lo implemento nel Service
    //generare un id automaticamente
    T save(T entity){
        if (entity != null){
            if(entity.getId()==null){
                entity.setId(getNextId());
            }
            map.put(entity.getId(),entity);
        }
        else{
            throw new  RuntimeException("Entity cannot be null");
        }
        return entity;
    }
    //Delete by Id method
    void deletebyId(ID id){
        map.remove(id);
    }
    //Delete by Entity
    void delete(T entity){
        map.entrySet().removeIf(entry -> entry.getValue().equals(entity));
    }

    private Long getNextId(){
        Long nextId = null;

               try {
                   nextId = Collections.max(map.keySet()) + 1;
               }catch (NoSuchElementException e){
                   nextId = 1L;
               }
        return nextId;
    }

}
