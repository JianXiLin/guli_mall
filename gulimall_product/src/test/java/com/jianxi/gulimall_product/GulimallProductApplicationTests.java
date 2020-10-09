package com.jianxi.gulimall_product;

import com.jianxi.gulimall_product.entity.BrandEntity;
import com.jianxi.gulimall_product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {

	@Autowired
	BrandService brandService;

	@Test
	void contextLoads() {
		BrandEntity brandEntity = new BrandEntity();
		brandEntity.setName("Brand");
		brandService.save(brandEntity);
	}

}
