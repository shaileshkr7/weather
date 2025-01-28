package src;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "controller")
public class apiApplication {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        SpringApplication.run(apiApplication.class, args);
    }
}
