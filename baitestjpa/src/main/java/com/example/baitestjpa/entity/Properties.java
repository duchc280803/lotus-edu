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
@Table(name = "Properties")
public class Properties {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PropertyId")
    private Integer propertyId;

    @ManyToOne
    @JoinColumn(name = "ProductId")
    private Product product;

    @Column(name = "PropertyName")
    private String propertyName;

    @OneToMany(mappedBy = "properties", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<PropertyDetails> propertyDetailsList;

}
