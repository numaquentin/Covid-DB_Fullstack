package org.polytech.covid.repository;

import java.util.List;

import org.polytech.covid.domain.VaccinationCenter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccinationCenterRepository 
    extends JpaRepository<VaccinationCenter, Integer> {
        public List<VaccinationCenter> findAllByCityLike(String city);
}
