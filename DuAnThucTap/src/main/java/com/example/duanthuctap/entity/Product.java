package com.example.duanthuctap.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "name_product")
    private String nameProduct;

    @Column(name = "price")
    private Double price;

    @Column(name = "avartar_image_product")
    private String avartarImageProduct;

    @Column(name = "title")
    private String title;

    @Column(name = "discount")
    private Integer discount;

    @Column(name = "status")
    private Integer status;

    @Column(name = "number_of_views")
    private Integer numberOfViews;

    @Column(name = "created_at")
    private LocalDate createdAt;

    @Column(name = "update_at")
    private LocalDate updateAt;

    @ManyToOne
    @JoinColumn(name = "product_type_id")
    private ProductType productType;

    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    private List<ProductReview> productReviewList;

    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    private List<OrderDetail> orderDetailList;

    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    private List<ProductImage> productImageList;

    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    private List<CartItem> cartItemList;

}
