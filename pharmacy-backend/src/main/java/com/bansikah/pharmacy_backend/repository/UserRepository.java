package com.bansikah.pharmacy_backend.repository;

import com.bansikah.pharmacy_backend.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Add custom repository methods if needed
}
