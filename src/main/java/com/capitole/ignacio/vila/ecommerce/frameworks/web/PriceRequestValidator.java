package com.capitole.ignacio.vila.ecommerce.frameworks.web;

import com.capitole.ignacio.vila.ecommerce.adapters.dto.FindPriceDTO;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class PriceRequestValidator {
    public void validate(FindPriceDTO findPriceDTO) {
        if (findPriceDTO.brandId < 1) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid brand id");
        }

        if (findPriceDTO.productId < 1) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid product id");
        }

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH.mm.ss");
            LocalDateTime dateTime = LocalDateTime.parse(findPriceDTO.date, formatter);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid date", ex);
        }
    }
}
