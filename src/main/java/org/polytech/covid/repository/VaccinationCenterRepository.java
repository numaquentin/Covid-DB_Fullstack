package org.polytech.covid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccinationCenterRepository 
    extends JpaRepository<VaccinationCenter, Integer> {
        public List<VaccinationCenter> findAllByCityLike(String city);
}
