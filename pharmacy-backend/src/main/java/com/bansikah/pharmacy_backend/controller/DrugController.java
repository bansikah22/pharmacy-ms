package com.bansikah.pharmacy_backend.controller;

import com.bansikah.pharmacy_backend.domain.Drug;
import com.bansikah.pharmacy_backend.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/drugs")
public class DrugController {

    @Autowired
    private DrugService drugService;

    @GetMapping
    public List<Drug> getAllDrugs() {
        return drugService.getAllDrugs();
    }

    @PostMapping
    public Drug addDrug(@RequestBody Drug drug) {
        return drugService.addDrug(drug);
    }

    @GetMapping("/{id}")
    public Drug getDrugById(@PathVariable Long id) {
        return drugService.getDrugById(id);
    }

    @PutMapping("/{id}")
    public Drug updateDrug(@PathVariable Long id, @RequestBody Drug drug) {
        return drugService.updateDrug(id, drug);
    }

    @DeleteMapping("/{id}")
    public void deleteDrug(@PathVariable Long id) {
        drugService.deleteDrug(id);
    }
}