package dojo.dojosninjas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dojo.dojosninjas.models.Dojo;
import dojo.dojosninjas.repositories.DojoRepository;

@Service
public class DojoService {
    @Autowired DojoRepository dojoRepository;

    public void createDojo(Dojo dojo) {
        dojoRepository.save(dojo);
    }
    
}
