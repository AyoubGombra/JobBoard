package esprit.candidat.controller;

import esprit.candidat.entities.Adresse;
import esprit.candidat.service.AdresseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Adresse")
public class AdresseController {
    @Autowired
    AdresseService adresseService;

    @PostMapping("/addAdresse")
    public Adresse addAdresse(@RequestBody Adresse adresse) {
        return adresseService.addAdresse(adresse);
    }


    @GetMapping("/findAll")
    public List<Adresse> getAllAdresse() {
        return adresseService.getAllAdresse();
    }

    @PutMapping("/updateAdresse/{id}")
    public Adresse updateAdresse(@PathVariable Integer id, @RequestBody Adresse adresse) {

        adresse.setId(id);
        return adresseService.updateAdresse(adresse);
    }


    @DeleteMapping("/delete/{id}")
    public void deleteAdresse(@PathVariable Integer id) {
        adresseService.deleteAdresse(id);
    }
}
