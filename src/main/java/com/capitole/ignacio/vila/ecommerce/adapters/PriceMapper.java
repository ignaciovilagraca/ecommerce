package com.capitole.ignacio.vila.ecommerce.adapters;

import com.capitole.ignacio.vila.ecommerce.adapters.dto.BrandDTO;
import com.capitole.ignacio.vila.ecommerce.adapters.dto.PriceDTO;
import com.capitole.ignacio.vila.ecommerce.domain.Brand;
import com.capitole.ignacio.vila.ecommerce.domain.Price;
import com.capitole.ignacio.vila.ecommerce.frameworks.database.PriceEntity;

public class PriceMapper {
    public PriceDTO mapToDto(Price price) {
        BrandDTO brandDTO = BrandDTO.builder().id(price.getBrand().getId()).build();
        return PriceDTO.builder()
                .id(price.getId())
                .brand(brandDTO)
                .productId(price.getProductId())
                .startDate(price.getStartDate())
                .endDate(price.getEndDate())
                .priority(price.getPriority())
                .price(price.getPrice())
                .currency(price.getCurrency())
                .build();
    }

    public Price mapToDomain(PriceEntity priceEntity) {
        Brand brand = Brand.builder().id(priceEntity.getBrandEntity().getId()).build();
        return Price.builder()
                .id(priceEntity.getId())
                .brand(brand)
                .productId(priceEntity.getProductId())
                .startDate(priceEntity.getStartDate())
                .endDate(priceEntity.getEndDate())
                .priority(priceEntity.getPriority())
                .price(priceEntity.getPrice())
                .currency(priceEntity.getCurrency())
                .build();
    }
}
