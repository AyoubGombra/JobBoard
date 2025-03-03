package esprit.candidat.service;

import esprit.candidat.entities.Candidat;
import esprit.candidat.repo.CandidatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatService {
    @Autowired
    CandidatRepository candidatRepository;

    public Candidat addCandidat(Candidat candidat) {
        return candidatRepository.save(candidat);
    }

    public void deleteCandidat(Integer idCandidat) {
        candidatRepository.deleteById(idCandidat);
    }

    public List<Candidat> getAllCandidat() {
        return candidatRepository.findAll();
    }

    public Candidat updateCandidat(Candidat candidat) {
        return candidatRepository.findById(candidat.getId())
                .map(existingEvent -> {
                    existingEvent.setId(candidat.getId());
                    existingEvent.setFirstName(candidat.getFirstName());
                    existingEvent.setLastName(candidat.getLastName());
                    existingEvent.setEmail(candidat.getEmail());
                    return candidatRepository.save(existingEvent);
                })
                .orElseThrow(() -> new RuntimeException("feedback not found with id: " + candidat.getId()));
    }
}
