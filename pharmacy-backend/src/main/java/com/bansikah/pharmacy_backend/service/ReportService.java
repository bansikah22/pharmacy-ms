package com.bansikah.pharmacy_backend.service;

import com.bansikah.pharmacy_backend.domain.Report;
import com.bansikah.pharmacy_backend.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService {

    @Autowired
    private ReportRepository reportRepository;

    public Report save(Report report) {
        return reportRepository.save(report);
    }

    public List<Report> findAll() {
        return reportRepository.findAll();
    }

    public Report findById(Long id) {
        return reportRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        reportRepository.deleteById(id);
    }
}