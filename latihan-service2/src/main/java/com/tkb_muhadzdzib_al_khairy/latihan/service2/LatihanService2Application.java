package com.tkb_muhadzdzib_al_khairy.latihan.service2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LatihanService2Application {

	public static void main(String[] args) {
		SpringApplication.run(LatihanService2Application.class, args);
	}


    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World2") String name) {
        return String.format("Hello %s!", name);
    }
}
