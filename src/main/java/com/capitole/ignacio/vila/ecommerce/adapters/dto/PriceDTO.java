package com.capitole.ignacio.vila.ecommerce.adapters.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;
import lombok.Builder;

@Builder
public class PriceDTO {
    public Long id;
    public BrandDTO brand;
    @JsonFormat(pattern = "yyyy-MM-dd-HH.mm.ss")
    public LocalDateTime startDate;
    @JsonFormat(pattern = "yyyy-MM-dd-HH.mm.ss")
    public LocalDateTime endDate;
    public Long productId;
    public Integer priority;
    public Double price;
    public String currency;
}
