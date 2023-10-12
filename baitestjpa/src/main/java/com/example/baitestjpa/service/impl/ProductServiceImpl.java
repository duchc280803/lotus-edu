package com.example.baitestjpa.service.impl;

import com.example.baitestjpa.Request.ProductBuyRequest;
import com.example.baitestjpa.Request.ProductUpdateRequest;
import com.example.baitestjpa.entity.ProductDetailPropertyDetails;
import com.example.baitestjpa.entity.ProductDetails;
import com.example.baitestjpa.repository.ProductDetailPropertyDetailRepo;
import com.example.baitestjpa.repository.ProductDetailsRepository;
import com.example.baitestjpa.response.ProductDetailsResponse;
import com.example.baitestjpa.response.ProductStatusResponse;
import com.example.baitestjpa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDetailsRepository productDetailsRepository;

    @Override
    public List<ProductDetailsResponse> findByProductDetail() {
        return productDetailsRepository.findByProductDetails();
    }

    @Override
    public ProductStatusResponse buyProduct(ProductBuyRequest productBuyRequest, Integer productId) {
        ProductDetails productDetails = productDetailsRepository.findByProductBuy(productId);
        if (productDetails == null) {
            return new ProductStatusResponse("Sản Phẩm Không Tồn Tại");
        }
        if (productDetails.getQuantity() < productBuyRequest.getQuantity()) {
            return new ProductStatusResponse("Sản Phẩm Không Đủ Để Mua");
        }
        if (productDetails.getQuantity() == 0) {
            return new ProductStatusResponse("Sản Phẩm Hết Hàng");
        }
        productDetails.setQuantity(productDetails.getQuantity() - productBuyRequest.getQuantity());
        productDetailsRepository.save(productDetails);
        return new ProductStatusResponse("Mua Sản Phẩm Thành Công");
    }

    @Override
    public ProductStatusResponse updateSoLuong(ProductUpdateRequest productUpdateRequest, Integer productId) {
        var findByProduct = productDetailsRepository.findById(productId);
        if (findByProduct.isEmpty()) {
            return new ProductStatusResponse("Sản Phẩm Trống");
        }
        findByProduct.get().setQuantity(productUpdateRequest.getQuantity());
        productDetailsRepository.save(findByProduct.get());
        return new ProductStatusResponse("Update Thành Công Số Lượng Sản Phẩm");
    }
}
