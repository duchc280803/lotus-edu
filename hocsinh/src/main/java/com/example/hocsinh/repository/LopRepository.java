package com.example.hocsinh.repository;

import com.example.hocsinh.entity.Lop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LopRepository extends JpaRepository<Lop, Integer> {
}
