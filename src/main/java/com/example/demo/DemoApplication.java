package com.example.demo;

import com.example.demo.soapclient.Client;
import localhost.universities.GetUniversityResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @Bean
    CommandLineRunner lookup(Client client) {
        return args -> {
            String uni = "Juja Boys";
            try {
                GetUniversityResponse response = client.getUniversity(uni);
                System.out.println(response.getUniversity().getName());
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

        };
    }

}
