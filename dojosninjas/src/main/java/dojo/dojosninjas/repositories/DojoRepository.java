package dojo.dojosninjas.repositories;

import org.springframework.data.repository.CrudRepository;

import dojo.dojosninjas.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long> {
    
}
