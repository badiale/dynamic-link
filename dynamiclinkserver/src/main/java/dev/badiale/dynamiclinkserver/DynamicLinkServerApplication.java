package dev.badiale.dynamiclinkserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableConfigurationProperties(DynamicLinkProperties.class)
@EnableFeignClients(basePackageClasses = DynamicLinkServerApplication.class)
public class DynamicLinkServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicLinkServerApplication.class, args);
    }

}
