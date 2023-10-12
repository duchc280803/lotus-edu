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
@Table(name = "PropertyDetails")
public class PropertyDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PropertyDetailId")
    private Integer propertyDetailId;

    @ManyToOne
    @JoinColumn(name = "PropertyId")
    private Properties properties;

    @Column(name = "ProductDetailCode")
    private String productDetailCode;

    @Column(name = "ProductDetailDetail")
    private String productDetailDetail;

    @OneToMany(mappedBy = "propertyDetails", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<ProductDetailPropertyDetails> productDetailPropertyDetailsList;

}
