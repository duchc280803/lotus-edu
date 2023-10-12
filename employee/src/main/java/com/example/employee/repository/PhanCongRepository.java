package com.example.employee.repository;

import com.example.employee.entity.PhanCong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhanCongRepository extends JpaRepository<PhanCong, Integer> {
}
