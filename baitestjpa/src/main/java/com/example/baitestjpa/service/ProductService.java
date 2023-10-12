package com.example.baitestjpa.service;

import com.example.baitestjpa.Request.ProductBuyRequest;
import com.example.baitestjpa.Request.ProductUpdateRequest;
import com.example.baitestjpa.entity.ProductDetails;
import com.example.baitestjpa.response.ProductDetailsResponse;
import com.example.baitestjpa.response.ProductStatusResponse;

import java.util.List;

public interface ProductService {

    List<ProductDetailsResponse> findByProductDetail();

    ProductStatusResponse buyProduct(ProductBuyRequest productBuyRequest, Integer productId);

    ProductStatusResponse updateSoLuong(ProductUpdateRequest productUpdateRequest, Integer productId);
}
