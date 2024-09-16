package com.bansikah.pharmacy_backend.repository;

import com.bansikah.pharmacy_backend.domain.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesRepository extends JpaRepository<Sales, Long> {
}
