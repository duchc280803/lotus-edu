package com.example.demokhoahoc.repository;

import com.example.demokhoahoc.entity.NgayHoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NgayHocRepostiory extends JpaRepository<NgayHoc, Integer> {
}
