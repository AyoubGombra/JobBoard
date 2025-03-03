package esprit.candidat.service;

import esprit.candidat.entities.Adresse;
import esprit.candidat.repo.AdresseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdresseService {
    @Autowired
    AdresseRepo adresseRepo;

    public Adresse addAdresse(Adresse adresse) {
        return adresseRepo.save(adresse);
    }

    public void deleteAdresse(Integer idAdresse) {
        adresseRepo.deleteById(idAdresse);
    }

    public List<Adresse> getAllAdresse() {
        return adresseRepo.findAll();
    }

    public Adresse updateAdresse(Adresse adresse) {
        return adresseRepo.findById(adresse.getId())
                .map(existingEvent -> {
                    existingEvent.setId(adresse.getId());
                    existingEvent.setStreet(adresse.getStreet());
                    existingEvent.setHouseNumber(adresse.getHouseNumber());
                    existingEvent.setZipCode(adresse.getZipCode());
                    return adresseRepo.save(existingEvent);
                })
                .orElseThrow(() -> new RuntimeException("feedback not found with id: " + adresse.getId()));
    }
}
