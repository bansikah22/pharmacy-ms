package com.bansikah.pharmacy_backend.repository;

import com.bansikah.pharmacy_backend.domain.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}

