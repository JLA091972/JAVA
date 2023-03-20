package dojo.dojosninjas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dojo.dojosninjas.models.Ninja;
import dojo.dojosninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
    @Autowired
    NinjaRepository ninjaRepository;

    public void createNinja(Ninja ninja) {
        ninjaRepository.save(ninja);
    }
    
}
