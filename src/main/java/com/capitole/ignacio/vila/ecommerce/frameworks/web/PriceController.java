package com.capitole.ignacio.vila.ecommerce.frameworks.web;

import java.time.LocalDateTime;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PriceController {
    @GetMapping("/price")
    public PriceDTO getPrice(@PathVariable Long brandId, @PathVariable Long productId, @PathVariable LocalDateTime date) {
        return null;
    }
}
