package src;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication(scanBasePackages = {"controller", "service"})
@EnableCaching
public class apiApplication {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        SpringApplication.run(apiApplication.class, args);
    }
}
