package br.com.caiopaulucci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.annotation.IntegrationComponentScan;

@Configuration
@EnableAutoConfiguration
@IntegrationComponentScan(basePackages = "br.com.caiopaulucci")
@ComponentScan("br.com.caiopaulucci")
@ImportResource(value={"classpath:context.xml","classpath:resources.xml"})
public class Start {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(Start.class, args);
	}

}