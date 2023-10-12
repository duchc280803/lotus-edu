package com.example.employee.repository;

import com.example.employee.entity.DuAn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DuAnRepository extends JpaRepository<DuAn, Integer> {
}
