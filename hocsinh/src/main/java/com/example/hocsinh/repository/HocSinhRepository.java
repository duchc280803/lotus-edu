package com.example.hocsinh.repository;

import com.example.hocsinh.entity.HocSinh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HocSinhRepository extends JpaRepository<HocSinh, Integer> {
}
