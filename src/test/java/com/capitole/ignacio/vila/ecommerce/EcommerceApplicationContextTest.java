package com.capitole.ignacio.vila.ecommerce;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.util.Assert;

@SpringBootTest
class EcommerceApplicationContextTest {

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	void contextLoads() {
		Assert.notNull(applicationContext, "Application context should not be null");
	}

}
