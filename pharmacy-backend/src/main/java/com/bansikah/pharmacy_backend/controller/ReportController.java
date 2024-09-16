package com.bansikah.pharmacy_backend.controller;

import com.bansikah.pharmacy_backend.domain.Report;
import com.bansikah.pharmacy_backend.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reports")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @PostMapping
    public Report save(@RequestBody Report report) {
        return reportService.save(report);
    }

    @GetMapping
    public List<Report> findAll() {
        return reportService.findAll();
    }

    @GetMapping("/{id}")
    public Report findById(@PathVariable Long id) {
        return reportService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        reportService.deleteById(id);
    }
}