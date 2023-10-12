package com.example.phieuthu.repository;

import com.example.phieuthu.entity.NguyenLieu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NguyenLieuRepository extends JpaRepository<NguyenLieu, Integer> {
}
