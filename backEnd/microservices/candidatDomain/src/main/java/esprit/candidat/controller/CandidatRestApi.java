package esprit.candidat.controller;

import esprit.candidat.service.CandidatService;
import esprit.candidat.entities.Candidat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Candidat")
public class CandidatRestApi {
    @Autowired
    CandidatService candidatService;

    @PostMapping("/addCandidat")
    public Candidat addCandidat(@RequestBody Candidat candidat) {
        return candidatService.addCandidat(candidat);
    }


    @GetMapping("/findAll")
    public List<Candidat> getAllCandidat() {
        return candidatService.getAllCandidat();
    }

    @PutMapping("/updateCandidat/{id}")
    public Candidat updateCandidat(@PathVariable Integer id, @RequestBody Candidat candidat) {

        candidat.setId(id);
        return candidatService.updateCandidat(candidat);
    }


    @DeleteMapping("/delete/{id}")
    public void deleteCandidat(@PathVariable Integer id) {
        candidatService.deleteCandidat(id);
    }
}
