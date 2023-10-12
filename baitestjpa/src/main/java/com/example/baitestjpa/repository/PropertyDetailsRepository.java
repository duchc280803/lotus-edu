package com.example.baitestjpa.repository;

import com.example.baitestjpa.entity.PropertyDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyDetailsRepository extends JpaRepository<PropertyDetails, Integer> {
}
