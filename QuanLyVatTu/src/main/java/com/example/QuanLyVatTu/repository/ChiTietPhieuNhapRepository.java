package com.example.QuanLyVatTu.repository;

import com.example.QuanLyVatTu.entity.ChiTietPhieuNhap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChiTietPhieuNhapRepository extends JpaRepository<ChiTietPhieuNhap, Integer> {
}
