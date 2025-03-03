package org.example.application.conrtoller;

import org.example.application.entities.Application;
import org.example.application.services.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Application")
public class ApplicationController {
    @Autowired
    ApplicationService applicationService;

    @PostMapping("/addApplication")
    public Application addApplication(@RequestBody Application application) {
        return applicationService.addApplication(application);
    }


    @GetMapping("/findAll")
    public List<Application> getAllApplication() {
        return applicationService.getAllApplication();
    }

    @PutMapping("/updateApplication/{id}")
    public Application updateApplication(@PathVariable Integer id, @RequestBody Application application) {

        application.setId(id);
        return applicationService.updateApplication(application);
    }


    @DeleteMapping("/delete/{id}")
    public void deleteApplication(@PathVariable Integer id) {
        applicationService.deleteApplication(id);
    }
}
