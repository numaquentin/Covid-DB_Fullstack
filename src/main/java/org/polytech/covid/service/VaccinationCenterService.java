package org.polytech.covid.service;

import org.polytech.covid.repository.VaccinationCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class VaccinationCenterService {

    @Autowired
    private VaccinationCenterRepository centerRepository;

    public List<VaccinationCenter> findAllByCity(String CityName){
        return centerRepository.findAllByCityLike(CityName);
    }

    public List<VaccinationCenter> findAll(){
        return centerRepository.findAll();
    }
    
}
