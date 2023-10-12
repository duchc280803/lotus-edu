package com.example.QuanLyVatTu.repository;

import com.example.QuanLyVatTu.entity.ChiTietPhieuXuat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChiTietPhieuXuatRepository extends JpaRepository<ChiTietPhieuXuat, Integer> {
}
