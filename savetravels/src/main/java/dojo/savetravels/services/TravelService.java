package dojo.savetravels.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dojo.savetravels.models.Travel;
import dojo.savetravels.repositories.TravelRepository;

@Service
public class TravelService {
    @Autowired TravelRepository travelRepository;

    public void createExpense(Travel item) {
        travelRepository.save(item);
    }

    public List<Travel> getAllItems() {
        return travelRepository.findAll();
    }
     
}
