package com.zhengyuan.liunao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@SpringBootApplication
public class TestSpboot2Application {

	// 用spring 资源加载类 ResourceLoader
	public static void main(String[] args) {
		SpringApplication.run(TestSpboot2Application.class, args);
	}

	/**
	 * 上传文件配置 注意这里可以设置编码，防止中文乱码
	 */
	@Bean
	public MultipartResolver multipartResolver() {
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
		multipartResolver.setMaxUploadSize(1000000);
		multipartResolver.setDefaultEncoding("UTF-8");
		return multipartResolver;
	}

}
