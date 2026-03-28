package es.techbridge.techbridgeeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TechBridgeEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TechBridgeEurekaApplication.class, args);
    }
    //The server has a home page with a UI and HTTP API endpoints for the normal Eureka functionality under /eureka/*
}
