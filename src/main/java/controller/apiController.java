package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import service.serviceWeather;

import java.util.HashMap;
import java.util.Map;

@RestController
public class apiController {
    @Autowired
    private serviceWeather serviceWeather1;
    @GetMapping("/api/weather")
    public Map<String, String> api(@RequestParam String city) {
        Map<String, String> weatherResult = new HashMap<>();
        String response = serviceWeather1.getWeather(city);
        weatherResult.put(city+": ", response);
        return weatherResult;
    }
}
