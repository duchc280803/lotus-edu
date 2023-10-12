package com.example.duanthuctap.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "created_at")
    private LocalDate createdAt;

    @Column(name = "update_at")
    private LocalDate updateAt;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<ProductReview> productReviewList;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Orders> ordersList;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Carts> cartsList;

}
