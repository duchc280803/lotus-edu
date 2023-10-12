package com.example.baitestjpa.repository;

import com.example.baitestjpa.entity.ProductDetailPropertyDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDetailPropertyDetailRepo extends JpaRepository<ProductDetailPropertyDetails, Integer> {


}
