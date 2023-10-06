package org.polytech.covid.web;
import java.util.List;

import org.polytech.covid.domain.VaccinationCenter;
import org.polytech.covid.service.VaccinationCenterService;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
=======
import org.springframework.stereotype.Controller;
>>>>>>> 5f2bee18bb84f7d5c6fdc7a76689bfd6b87ebd1d

@Controller
public class VaccinationCenterController {
    
    @Autowired
    private VaccinationCenterService CenterService;

    @GetMapping(path = "api/centers/{city}")
    public ResponseEntity<List<VaccinationCenter>> findAllByCity(@PathVariable String city){

        return ResponseEntity.ok(CenterService.findAllByCity(city));
    }
    public VaccinationCenterService getCenterService() {
        return CenterService;
    }

    public void setCenterService(VaccinationCenterService centerService) {
        CenterService = centerService;
    }
}
