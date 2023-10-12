package com.example.phieuthu.repository;

import com.example.phieuthu.entity.LoaiNguyenLieu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiNguyenLieuRepository extends JpaRepository<LoaiNguyenLieu, Integer> {
}
