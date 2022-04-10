package com.hello.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 标注这个类是一个springboot 的应用
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// 将springboot 应用启动
		SpringApplication.run(DemoApplication.class, args);
	}

}
