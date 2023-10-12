package com.example.monan.repository;

import com.example.monan.entity.MonAn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonAnRepository extends JpaRepository<MonAn, Integer> {
}
