package com.capitole.ignacio.vila.ecommerce.frameworks.database;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "price")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PriceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private BrandEntity brandEntity;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private Long productId;

    private Integer priority;

    private Double price;

    @Column(name = "curr")
    private String currency;
}

