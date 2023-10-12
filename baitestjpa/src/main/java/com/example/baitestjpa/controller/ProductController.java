package com.example.baitestjpa.controller;

import com.example.baitestjpa.Request.ProductBuyRequest;
import com.example.baitestjpa.Request.ProductUpdateRequest;
import com.example.baitestjpa.entity.ProductDetails;
import com.example.baitestjpa.response.ProductDetailsResponse;
import com.example.baitestjpa.response.ProductStatusResponse;
import com.example.baitestjpa.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @GetMapping("show")
    public ResponseEntity<List<ProductDetailsResponse>> findByProductDetail() {
        return ResponseEntity.ok(productService.findByProductDetail());
    }

    @PutMapping("update-quantity/{productId}")
    public ResponseEntity<ProductStatusResponse> updateQuantity(
            @RequestBody ProductUpdateRequest productUpdateRequest,
            @PathVariable("productId") Integer productId
    ) {
        return new ResponseEntity<>(productService.updateSoLuong(productUpdateRequest, productId), HttpStatus.OK);
    }

    @PutMapping("buy-product/{productId}")
    public ResponseEntity<ProductStatusResponse> buyProduct(
            @RequestBody ProductBuyRequest productBuyRequest,
            @PathVariable("productId") Integer productId
    ) {
        return new ResponseEntity<>(productService.buyProduct(productBuyRequest, productId), HttpStatus.OK);
    }
}
