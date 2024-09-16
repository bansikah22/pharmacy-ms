package com.bansikah.pharmacy_backend.service;

import com.bansikah.pharmacy_backend.domain.Drug;
import com.bansikah.pharmacy_backend.repository.DrugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DrugService {

    @Autowired
    private DrugRepository drugRepository;

    public List<Drug> getAllDrugs() {
        return drugRepository.findAll();
    }

    public Drug addDrug(Drug drug) {
        return drugRepository.save(drug);
    }

    public Drug getDrugById(Long id) {
        Optional<Drug> drug = drugRepository.findById(id);
        return drug.orElse(null);
    }

    public Drug updateDrug(Long id, Drug drug) {
        if (drugRepository.existsById(id)) {
            drug.setId(id);
            return drugRepository.save(drug);
        }
        return null;
    }

    public void deleteDrug(Long id) {
        drugRepository.deleteById(id);
    }
}