package com.example.QuanLyVatTu.repository;

import com.example.QuanLyVatTu.entity.VatTu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VatTuRepository extends JpaRepository<VatTu, Integer> {
}
