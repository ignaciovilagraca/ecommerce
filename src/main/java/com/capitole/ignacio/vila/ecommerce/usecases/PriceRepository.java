package com.capitole.ignacio.vila.ecommerce.usecases;

import com.capitole.ignacio.vila.ecommerce.domain.Price;
import java.time.LocalDateTime;
import java.util.List;

public interface PriceRepository {
    List<Price> findPrices(Long brandId, Long productId, LocalDateTime date);
}
