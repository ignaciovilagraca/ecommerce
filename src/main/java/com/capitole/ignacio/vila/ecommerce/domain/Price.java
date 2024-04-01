package com.capitole.ignacio.vila.ecommerce.domain;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Price {
    private Long id;
    private Brand brand;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Long productId;
    private Integer priority;
    private Double price;
    private String currency;
}
