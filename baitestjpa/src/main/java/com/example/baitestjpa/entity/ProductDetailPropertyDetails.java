package com.example.baitestjpa.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ProductDetailPropertyDetails")
public class ProductDetailPropertyDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProductDetailPropertyDetailId")
    private Integer productDetailPropertyDetailId;

    @ManyToOne
    @JoinColumn(name = "ProductId")
    @JsonBackReference
    private Product product;

    @ManyToOne
    @JoinColumn(name = "PropertyDetailId")
    @JsonBackReference
    private PropertyDetails propertyDetails;

    @ManyToOne
    @JoinColumn(name = "ProductDetailId")
    @JsonBackReference
    private ProductDetails productDetails;
}
