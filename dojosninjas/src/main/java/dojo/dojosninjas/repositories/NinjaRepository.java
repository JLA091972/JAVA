package dojo.dojosninjas.repositories;

import org.springframework.data.repository.CrudRepository;

import dojo.dojosninjas.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long> {
    
}
