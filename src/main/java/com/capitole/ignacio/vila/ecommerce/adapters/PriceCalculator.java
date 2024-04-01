package com.capitole.ignacio.vila.ecommerce.adapters;

import com.capitole.ignacio.vila.ecommerce.adapters.dto.FindPriceDTO;
import com.capitole.ignacio.vila.ecommerce.adapters.dto.PriceDTO;
import com.capitole.ignacio.vila.ecommerce.domain.Price;
import com.capitole.ignacio.vila.ecommerce.usecases.PriceFinder;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PriceCalculator {

    private PriceFinder priceFinder;
    private PriceMapper priceMapper;
    public Optional<PriceDTO> calculate(FindPriceDTO dto) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH.mm.ss");
        LocalDateTime dateTime = LocalDateTime.parse(dto.date, formatter);
        Optional<Price> price = priceFinder.find(dto.brandId, dto.productId, dateTime);
        return price.map(p -> priceMapper.mapToDto(p));
    }
}
