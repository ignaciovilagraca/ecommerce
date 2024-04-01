package com.capitole.ignacio.vila.ecommerce.frameworks.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceController {
    @GetMapping("/price")
    public PriceDTO getPrice(@RequestParam Long brandId, @RequestParam Long productId, @RequestParam String date) {
        return new PriceDTO();
    }
}
