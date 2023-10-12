package com.example.monan.repository;

import com.example.monan.entity.CongThuc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CongThucRepository extends JpaRepository<CongThuc, Integer> {

}
