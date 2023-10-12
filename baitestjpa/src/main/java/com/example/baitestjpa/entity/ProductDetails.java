package com.example.baitestjpa.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ProductDetails")
public class ProductDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProductDetailId")
    private Integer productDetailId;

    @Column(name = "ProductPropertyName")
    private String productPropertyName;

    @Column(name = "Quantity")
    private Integer quantity;

    @Column(name = "Price")
    private Float price;

    @Column(name = "ShellPrice")
    private Float shellPrice;

    @Column(name = "parent_id")
    private Integer parentId;

    @OneToMany(mappedBy = "productDetails", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<ProductDetailPropertyDetails> productDetailPropertyDetailsList;
}
