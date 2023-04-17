package com.example.sbsj_process.category.controller.form;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
public class ProductListResponse {
    final private String title;
    final private String thumbnail;
    final private Long price;
    final private Long productId;
    final private Long wish;
    final private List<String> productOptions;
    public ProductListResponse(String title, String thumbnail, Long price, Long productId, Long wish, List<String> productOptions) {
        this.title = title;
        this.thumbnail = thumbnail;
        this.price = price;
        this.productId = productId;
        this.wish = wish;
        this.productOptions = productOptions;
    }
}
