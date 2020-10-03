package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ${tym}
 * USER 表示主机名
 * @date ${DATE} ${TIME}
 * DATA 为文档创建日期，TIME 为详细创建时间
 */


@SpringBootApplication
@MapperScan("com.example.demo.mapper")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}

