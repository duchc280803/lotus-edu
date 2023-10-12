package com.example.baitestjpa.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetailsResponse {

    private Integer productDetailId;

    private String productPropertyName;

    private Integer quantity;

    private Float price;

    private Float shellPrice;

    private Integer parentId;
}
