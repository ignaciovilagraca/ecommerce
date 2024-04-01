package com.capitole.ignacio.vila.ecommerce.frameworks.database;

import com.capitole.ignacio.vila.ecommerce.adapters.PriceMapper;
import com.capitole.ignacio.vila.ecommerce.domain.Price;
import com.capitole.ignacio.vila.ecommerce.usecases.PriceRepository;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PriceRepositoryImp implements PriceRepository {
    private PriceRepositoryJPA priceRepositoryJPA;
    private PriceMapper priceMapper;
    @Override
    public List<Price> findPrices(Long brandId, Long productId, LocalDateTime date) {
        List<PriceEntity> prices = priceRepositoryJPA.findByBrandEntity_IdAndProductIdAndStartDateLessThanAndEndDateGreaterThan(brandId, productId, date, date);
        return prices.stream().map(priceMapper::mapToDomain).collect(Collectors.toList());
    }
}
