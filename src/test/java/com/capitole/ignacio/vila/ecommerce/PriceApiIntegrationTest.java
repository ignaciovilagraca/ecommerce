package com.capitole.ignacio.vila.ecommerce;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PriceApiIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void givenTestCase1() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.get("/price")
                        .queryParam("brandId", "1")
                        .queryParam("productId", "35455")
                        .queryParam("date", "2020-06-14-10.00.00")
        ).andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(1))
        .andExpect(MockMvcResultMatchers.jsonPath("$.brand.id").value(1))
        .andExpect(MockMvcResultMatchers.jsonPath("$.startDate").value("2020-06-14-00.00.00"))
        .andExpect(MockMvcResultMatchers.jsonPath("$.endDate").value("2020-12-31-23.59.59"))
        .andExpect(MockMvcResultMatchers.jsonPath("$.productId").value(35455))
        .andExpect(MockMvcResultMatchers.jsonPath("$.priority").value(0))
        .andExpect(MockMvcResultMatchers.jsonPath("$.price").value(35.50))
        .andExpect(MockMvcResultMatchers.jsonPath("$.currency").value("EUR"));
    }

    @Test
    void givenTestCase2() throws Exception {
        mockMvc.perform(
                        MockMvcRequestBuilders.get("/price")
                                .queryParam("brandId", "1")
                                .queryParam("productId", "35455")
                                .queryParam("date", "2020-06-14-16.00.00")
                ).andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(2))
                .andExpect(MockMvcResultMatchers.jsonPath("$.brand.id").value(1))
                .andExpect(MockMvcResultMatchers.jsonPath("$.startDate").value("2020-06-14-15.00.00"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.endDate").value("2020-06-14-18.30.00"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.productId").value(35455))
                .andExpect(MockMvcResultMatchers.jsonPath("$.priority").value(1))
                .andExpect(MockMvcResultMatchers.jsonPath("$.price").value(25.45))
                .andExpect(MockMvcResultMatchers.jsonPath("$.currency").value("EUR"));
    }

    @Test
    void givenTestCase3() throws Exception {
        mockMvc.perform(
                        MockMvcRequestBuilders.get("/price")
                                .queryParam("brandId", "1")
                                .queryParam("productId", "35455")
                                .queryParam("date", "2020-06-14-21.00.00")
                ).andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(1))
                .andExpect(MockMvcResultMatchers.jsonPath("$.brand.id").value(1))
                .andExpect(MockMvcResultMatchers.jsonPath("$.startDate").value("2020-06-14-00.00.00"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.endDate").value("2020-12-31-23.59.59"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.productId").value(35455))
                .andExpect(MockMvcResultMatchers.jsonPath("$.priority").value(0))
                .andExpect(MockMvcResultMatchers.jsonPath("$.price").value(35.50))
                .andExpect(MockMvcResultMatchers.jsonPath("$.currency").value("EUR"));
    }

    @Test
    void givenTestCase4() throws Exception {
        mockMvc.perform(
                        MockMvcRequestBuilders.get("/price")
                                .queryParam("brandId", "1")
                                .queryParam("productId", "35455")
                                .queryParam("date", "2020-06-15-10.00.00")
                ).andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(3))
                .andExpect(MockMvcResultMatchers.jsonPath("$.brand.id").value(1))
                .andExpect(MockMvcResultMatchers.jsonPath("$.startDate").value("2020-06-15-00.00.00"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.endDate").value("2020-06-15-11.00.00"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.productId").value(35455))
                .andExpect(MockMvcResultMatchers.jsonPath("$.priority").value(1))
                .andExpect(MockMvcResultMatchers.jsonPath("$.price").value(30.50))
                .andExpect(MockMvcResultMatchers.jsonPath("$.currency").value("EUR"));
    }

    @Test
    void givenTestCase5() throws Exception {
        mockMvc.perform(
                        MockMvcRequestBuilders.get("/price")
                                .queryParam("brandId", "1")
                                .queryParam("productId", "35455")
                                .queryParam("date", "2020-06-16-21.00.00")
                ).andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(4))
                .andExpect(MockMvcResultMatchers.jsonPath("$.brand.id").value(1))
                .andExpect(MockMvcResultMatchers.jsonPath("$.startDate").value("2020-06-15-16.00.00"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.endDate").value("2020-12-31-23.59.59"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.productId").value(35455))
                .andExpect(MockMvcResultMatchers.jsonPath("$.priority").value(1))
                .andExpect(MockMvcResultMatchers.jsonPath("$.price").value(38.95))
                .andExpect(MockMvcResultMatchers.jsonPath("$.currency").value("EUR"));
    }
}
