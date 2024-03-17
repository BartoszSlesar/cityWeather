package com.bard.cityweather.controller;


import com.bard.cityweather.model.Weather;
import com.bard.cityweather.services.WeatherApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class CityWeatherController {

    private final WeatherApiService weatherApiService;



    @GetMapping("/weather")
    public String getCityWeather(@RequestParam(required = false) String city, Model model) {
        if(city == null || city.isEmpty()){
            return "redirect:/";
        }
        Weather weather = weatherApiService.getWeatherForCity(city);
        if (weather != null) {
            weather.setCity(city);
        }
        model.addAttribute("cityWeather", weather);
        return "weather";
    }
}
