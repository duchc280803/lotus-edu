package com.example.duanthuctap.repository;

import com.example.duanthuctap.entity.Carts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartsRepository extends JpaRepository<Carts, Integer> {
}
