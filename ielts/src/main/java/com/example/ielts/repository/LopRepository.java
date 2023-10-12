package com.example.ielts.repository;

import com.example.ielts.entity.Lop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LopRepository extends JpaRepository<Lop, Integer> {

}
