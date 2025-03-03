package org.example.application.services;

import org.example.application.entities.Application;
import org.example.application.repo.ApplicationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {
    @Autowired
    ApplicationRepo applicationRepo;

    public Application addApplication(Application application) {
        return applicationRepo.save(application);
    }

    public void deleteApplication(Integer idApplication) {
        applicationRepo.deleteById(idApplication);
    }

    public List<Application> getAllApplication() {
        return applicationRepo.findAll();
    }

    public Application updateApplication(Application application) {
        return applicationRepo.findById(application.getId())
                .map(existingEvent -> {
                    existingEvent.setId(application.getId());
                    existingEvent.setAppDate(application.getAppDate());
                    existingEvent.setMotivation(application.getMotivation());
                    return applicationRepo.save(existingEvent);
                })
                .orElseThrow(() -> new RuntimeException("feedback not found with id: " + application.getId()));
    }
}
