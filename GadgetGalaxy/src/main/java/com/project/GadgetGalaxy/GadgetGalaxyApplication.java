package com.project.GadgetGalaxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class GadgetGalaxyApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(GadgetGalaxyApplication.class, args);
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// Map the URL pattern /images/** to the file system path
		registry.addResourceHandler("/images/**")
				.addResourceLocations("file:/C:/Users/HP/Desktop/Java Projects/GadgetGalaxy - tech e-commerce/images/");
	}
}
