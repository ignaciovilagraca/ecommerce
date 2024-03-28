package com.capitole.ignacio.vila.ecommerce.frameworks.web;

import com.capitole.ignacio.vila.ecommerce.domain.Brand;
import java.time.LocalDateTime;

public class PriceDTO {
    private Long id;
    private Brand brand;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Long productId;
    private Integer priority;
    private Double price;
    private String currency;
}
