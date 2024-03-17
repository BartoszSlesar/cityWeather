
package com.bard.cityweather.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "WeatherText",
        "WeatherIcon",
        "IsDayTime",
        "Temperature",
        "RealFeelTemperature",
        "RelativeHumidity",
        "Wind",
        "Pressure",
        "MobileLink",
        "Link"
})
@ToString
public class Weather {

    @JsonIgnore
    @Getter
    @Setter
    private String city;


    @JsonProperty("WeatherText")
    private String weatherText;
    @JsonProperty("WeatherIcon")
    private Integer weatherIcon;
    @JsonProperty("IsDayTime")
    private Boolean isDayTime;
    @JsonProperty("Temperature")
    private Temperature temperature;
    @JsonProperty("RealFeelTemperature")
    private RealFeelTemperature realFeelTemperature;
    @JsonProperty("RelativeHumidity")
    private Integer relativeHumidity;
    @JsonProperty("Wind")
    private Wind wind;
    @JsonProperty("Pressure")
    private Pressure pressure;
    @JsonProperty("MobileLink")
    private String mobileLink;
    @JsonProperty("Link")
    private String link;


    @JsonProperty("WeatherText")
    public String getWeatherText() {
        return weatherText;
    }

    @JsonProperty("WeatherText")
    public void setWeatherText(String weatherText) {
        this.weatherText = weatherText;
    }

    @JsonProperty("WeatherIcon")
    public Integer getWeatherIcon() {
        return weatherIcon;
    }

    @JsonProperty("WeatherIcon")
    public void setWeatherIcon(Integer weatherIcon) {
        this.weatherIcon = weatherIcon;
    }

    @JsonProperty("IsDayTime")
    public Boolean getIsDayTime() {
        return isDayTime;
    }

    @JsonProperty("IsDayTime")
    public void setIsDayTime(Boolean isDayTime) {
        this.isDayTime = isDayTime;
    }

    @JsonProperty("Temperature")
    public Temperature getTemperature() {
        return temperature;
    }

    @JsonProperty("Temperature")
    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    @JsonProperty("RealFeelTemperature")
    public RealFeelTemperature getRealFeelTemperature() {
        return realFeelTemperature;
    }

    @JsonProperty("RealFeelTemperature")
    public void setRealFeelTemperature(RealFeelTemperature realFeelTemperature) {
        this.realFeelTemperature = realFeelTemperature;
    }


    @JsonProperty("RelativeHumidity")
    public Integer getRelativeHumidity() {
        return relativeHumidity;
    }

    @JsonProperty("RelativeHumidity")
    public void setRelativeHumidity(Integer relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }


    @JsonProperty("Wind")
    public Wind getWind() {
        return wind;
    }

    @JsonProperty("Wind")
    public void setWind(Wind wind) {
        this.wind = wind;
    }

    @JsonProperty("Pressure")
    public Pressure getPressure() {
        return pressure;
    }

    @JsonProperty("Pressure")
    public void setPressure(Pressure pressure) {
        this.pressure = pressure;
    }

    @JsonProperty("MobileLink")
    public String getMobileLink() {
        return mobileLink;
    }

    @JsonProperty("MobileLink")
    public void setMobileLink(String mobileLink) {
        this.mobileLink = mobileLink;
    }

    @JsonProperty("Link")
    public String getLink() {
        return link;
    }

    @JsonProperty("Link")
    public void setLink(String link) {
        this.link = link;
    }


}
