package service;

import org.springframework.stereotype.Service;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

@Service
public class serviceWeather {
    public String getWeather(String city) {
        try {
            String urlString = "https://wttr.in/" + city + "?format=%C+%t+%w";
            URL url=new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int responseCode = connection.getResponseCode();
            String inline = "";
            Scanner sc = new Scanner(url.openStream());
            if (responseCode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responseCode);
            } else {
                while (sc.hasNext()) {
                    inline += sc.nextLine();
                }
                sc.close();
            }
            return inline;
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}
