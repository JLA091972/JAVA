package dojo.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dojo.savetravels.models.Travel;
import dojo.savetravels.repositories.TravelRepository;

@Service
public class TravelService {
    @Autowired
    TravelRepository travelRepository;

    public void createExpense(Travel item) {
        travelRepository.save(item);
    }

    public List<Travel> getAllItems() {
        return travelRepository.findAll();
    }

    public Travel getOneItem(Long id) {
        Optional<Travel> singleExpense = travelRepository.findById(id);
        Travel expense = singleExpense.orElse(null);
        return expense;
    }

    public void updateExpense(Travel item) {
        travelRepository.save(item);
    }

    public void deleteItem(Travel item) {
        travelRepository.delete(item);
    }

}
