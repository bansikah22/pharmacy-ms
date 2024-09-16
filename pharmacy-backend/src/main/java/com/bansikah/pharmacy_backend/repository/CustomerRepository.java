package com.bansikah.pharmacy_backend.repository;

import com.bansikah.pharmacy_backend.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
