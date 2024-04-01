package com.capitole.ignacio.vila.ecommerce.frameworks.configuration;

import com.capitole.ignacio.vila.ecommerce.adapters.PriceCalculator;
import com.capitole.ignacio.vila.ecommerce.adapters.PriceMapper;
import com.capitole.ignacio.vila.ecommerce.frameworks.database.PriceRepositoryImp;
import com.capitole.ignacio.vila.ecommerce.frameworks.database.PriceRepositoryJPA;
import com.capitole.ignacio.vila.ecommerce.frameworks.web.PriceRequestValidator;
import com.capitole.ignacio.vila.ecommerce.usecases.PriceFinder;
import com.capitole.ignacio.vila.ecommerce.usecases.PriceRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
public class WebConfig {

    public PriceRepositoryJPA priceRepositoryJPA;

    public WebConfig(PriceRepositoryJPA priceRepositoryJPA) {
        this.priceRepositoryJPA = priceRepositoryJPA;
    }

    @Bean
    public PriceRequestValidator priceRequestValidator() {
        return new PriceRequestValidator();
    }
    @Bean
    public PriceMapper priceMapper() {
        return new PriceMapper();
    }

    @Bean
    public PriceCalculator priceCalculator() {
        return new PriceCalculator(priceFinder(), priceMapper());
    }

    @Bean
    public PriceFinder priceFinder() {
        return new PriceFinder(priceRepository());
    }

    @Bean
    public PriceRepository priceRepository() {
        return new PriceRepositoryImp(priceRepositoryJPA, priceMapper());
    }
}
