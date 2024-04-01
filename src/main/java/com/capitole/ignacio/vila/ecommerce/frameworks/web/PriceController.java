package com.capitole.ignacio.vila.ecommerce.frameworks.web;

import com.capitole.ignacio.vila.ecommerce.adapters.PriceCalculator;
import com.capitole.ignacio.vila.ecommerce.adapters.dto.FindPriceDTO;
import com.capitole.ignacio.vila.ecommerce.adapters.dto.PriceDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@AllArgsConstructor
public class PriceController {

    private PriceRequestValidator priceRequestValidator;
    private PriceCalculator priceCalculator;

    @GetMapping("/price")
    public PriceDTO findPrice(@RequestParam Long brandId, @RequestParam Long productId, @RequestParam String date) {
        FindPriceDTO dto = new FindPriceDTO(brandId, productId, date);
        priceRequestValidator.validate(dto);
        return priceCalculator.calculate(dto).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No price available for the given input"));
    }
}
