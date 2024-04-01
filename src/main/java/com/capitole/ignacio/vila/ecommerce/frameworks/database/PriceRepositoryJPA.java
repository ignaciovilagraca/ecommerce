package com.capitole.ignacio.vila.ecommerce.frameworks.database;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepositoryJPA extends JpaRepository<PriceEntity, Long> {
    List<PriceEntity> findByBrandEntity_IdAndProductIdAndStartDateLessThanAndEndDateGreaterThan(Long productId, Long brandId, LocalDateTime startDate, LocalDateTime endDate);
}
