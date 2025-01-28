package controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@RestController
public class apiController {
    @GetMapping("/api/weather")
    public Map<String, String> api() {
        Map<String, String> weatherResult = new HashMap<>();
        weatherResult.put("message", "Hello, World!");
        return weatherResult;
    }
}
