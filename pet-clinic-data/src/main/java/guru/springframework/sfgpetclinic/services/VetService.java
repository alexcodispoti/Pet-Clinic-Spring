package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService extends CrudService<Vet, Long> {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

    void delete(Vet vet);
}
