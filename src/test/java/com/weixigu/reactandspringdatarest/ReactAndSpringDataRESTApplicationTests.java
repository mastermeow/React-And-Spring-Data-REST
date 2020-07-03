package com.weixigu.reactandspringdatarest;

import com.weixigu.reactandspringdatarest.controller.HomeController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

//Ad-hoc integration test on the local.
@SpringBootTest
class ReactAndSpringDataRESTApplicationTests {

	@Autowired
	private HomeController homeController;

	@Test
	void contextLoads() throws Exception{
		assertThat(this.homeController).isNotNull();
	}
}
