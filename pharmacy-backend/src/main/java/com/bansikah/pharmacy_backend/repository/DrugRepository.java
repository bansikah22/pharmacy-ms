package com.bansikah.pharmacy_backend.repository;

import com.bansikah.pharmacy_backend.domain.Drug;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrugRepository extends JpaRepository<Drug, Long> {
}
