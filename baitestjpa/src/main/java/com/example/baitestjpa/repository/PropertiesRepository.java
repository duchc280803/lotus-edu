package com.example.baitestjpa.repository;

import com.example.baitestjpa.entity.Properties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertiesRepository extends JpaRepository<Properties, Integer> {
}
