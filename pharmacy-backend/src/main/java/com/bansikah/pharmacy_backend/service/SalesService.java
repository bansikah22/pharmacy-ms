package com.bansikah.pharmacy_backend.service;

import com.bansikah.pharmacy_backend.domain.Sales;
import com.bansikah.pharmacy_backend.repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesService {

    @Autowired
    private SalesRepository salesRepository;

    public Sales save(Sales sales) {
        return salesRepository.save(sales);
    }

    public List<Sales> findAll() {
        return salesRepository.findAll();
    }

    public Sales findById(Long id) {
        return salesRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        salesRepository.deleteById(id);
    }
}
