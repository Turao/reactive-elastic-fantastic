package com.example.app;

import com.example.app.config.ElasticsearchTestConfig;
import com.example.app.config.RabbitMQTestConfig;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {ElasticsearchTestConfig.class, RabbitMQTestConfig.class})
class AppApplicationTests {

	@Test
	void contextLoads() {
	}

}
