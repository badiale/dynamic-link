package dev.badiale.dynamiclinkserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(DynamicLinkProperties.class)
public class DynamicLinkServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicLinkServerApplication.class, args);
    }

}
