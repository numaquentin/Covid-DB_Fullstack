package org.polytech.covid.web;

import org.polytech.covid.service.VaccinationCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class VaccinationCenterController {
    
    @Autowired
    private VaccinationCenterService CenterService;
}
