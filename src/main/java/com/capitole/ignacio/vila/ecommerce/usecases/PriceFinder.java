package com.capitole.ignacio.vila.ecommerce.usecases;

import com.capitole.ignacio.vila.ecommerce.domain.Price;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PriceFinder {
    private PriceRepository priceRepository;
    public Optional<Price> find(Long brandId, Long productId, LocalDateTime date) {
        List<Price> prices = priceRepository.findPrices(brandId, productId, date);
        return prices.stream().max(Comparator.comparing(Price::getPriority));
    }
}
