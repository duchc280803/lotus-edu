package com.example.baitestjpa.repository;

import com.example.baitestjpa.entity.ProductDetailPropertyDetails;
import com.example.baitestjpa.entity.ProductDetails;
import com.example.baitestjpa.entity.PropertyDetails;
import com.example.baitestjpa.response.ProductDetailsResponse;
import lombok.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDetailsRepository extends JpaRepository<ProductDetails, Integer> {

    @Query("SELECT new com.example.baitestjpa.response.ProductDetailsResponse" +
            "(pd.productDetailId, pd.productPropertyName,pd.quantity,pd.price, pd.shellPrice,pd.parentId)" +
            " FROM ProductDetailPropertyDetails pdp " +
            "JOIN pdp.productDetails pd " +
            "Join pdp.product p " +
            "JOIN pdp.propertyDetails ppd")
    List<ProductDetailsResponse> findByProductDetails();

    @Query("SELECT pd FROM ProductDetailPropertyDetails pdp " +
            "JOIN pdp.productDetails pd" +
            " Join pdp.product p " +
            "JOIN pdp.propertyDetails ppd where pd.productDetailId = :id")
    ProductDetails findByProductBuy(@Param("id") Integer id);

}
