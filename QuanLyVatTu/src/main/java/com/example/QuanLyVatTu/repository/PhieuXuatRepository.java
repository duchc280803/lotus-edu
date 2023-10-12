package com.example.QuanLyVatTu.repository;

import com.example.QuanLyVatTu.entity.PhieuNhap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhieuXuatRepository extends JpaRepository<PhieuNhap, Integer> {
}
