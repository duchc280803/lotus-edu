package com.example.monan.repository;

import com.example.monan.entity.NguyenLieu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NguyenLieuRepository extends JpaRepository<NguyenLieu, Integer> {
}
