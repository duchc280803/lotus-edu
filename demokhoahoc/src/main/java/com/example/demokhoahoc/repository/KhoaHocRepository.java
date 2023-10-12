package com.example.demokhoahoc.repository;

import com.example.demokhoahoc.entity.KhoaHoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhoaHocRepository extends JpaRepository<KhoaHoc, Integer> {
}
