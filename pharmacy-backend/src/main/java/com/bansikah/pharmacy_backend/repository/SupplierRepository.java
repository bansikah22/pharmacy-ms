package com.bansikah.pharmacy_backend.repository;

import com.bansikah.pharmacy_backend.domain.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
