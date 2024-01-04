package org.springframework.boot.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;

/**
 * @author ding
 * @date 2020/3/4
 */
@SpringBootConfiguration
public class TestOne {
	public static void main(String[] args) {
		SpringApplication.run(TestOne.class,args);
	}
}
