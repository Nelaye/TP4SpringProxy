package fr.content.TP4Proxy_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class Tp4ProxyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp4ProxyServiceApplication.class, args);
	}

}
