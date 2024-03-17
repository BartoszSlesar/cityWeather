package com.bard.cityweather.services;


import com.bard.cityweather.config.ApiWeatherConfig;
import com.bard.cityweather.model.City;
import com.bard.cityweather.model.Weather;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@Service
public class WeatherApiService {
    private final RestTemplate restTemplate;
    private final ApiWeatherConfig apiWeatherConfig;

    private final HashMap<String, String> cityCodes;


    public WeatherApiService(ApiWeatherConfig apiWeatherConfig) {
        this.apiWeatherConfig = apiWeatherConfig;
        this.restTemplate = new RestTemplate();
        this.cityCodes = new HashMap<>();
    }

    private String getCityLocationKey(String city) {
        String locationEndpoint = "http://dataservice.accuweather.com/locations/v1/search?q=" + city + "&apikey=" + apiWeatherConfig.getWeatherApiKey();
        String key = this.cityCodes.getOrDefault(city, "");

        if (key.isEmpty()) {
            City[] city1 = this.restTemplate.getForObject(locationEndpoint, City[].class);
            if (city1 != null && city1.length > 0) {
                key = city1[0].getKey();
                this.cityCodes.put(city, key);
            }
        }

        return key;
    }


    public Weather getWeatherForCity(String city) {
        String key = getCityLocationKey(city);

        String endpoint = "http://dataservice.accuweather.com/currentconditions/v1/"
                + key
                + "?details=true&apikey="
                + apiWeatherConfig.getWeatherApiKey();

        Weather[] weahter = this.restTemplate.getForObject(endpoint, Weather[].class);

        Weather cityWeather = null;

        if (weahter != null && weahter.length > 0) {
            cityWeather = weahter[0];
        }

        return cityWeather;
    }


}
