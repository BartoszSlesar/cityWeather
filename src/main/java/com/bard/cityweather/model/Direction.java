package com.bard.cityweather.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Degrees",
    "Localized",
    "English"
})

public class Direction {

    @JsonProperty("Degrees")
    private Integer degrees;
    @JsonProperty("Localized")
    private String localized;
    @JsonProperty("English")
    private String english;

    @JsonProperty("Degrees")
    public Integer getDegrees() {
        return degrees;
    }

    @JsonProperty("Degrees")
    public void setDegrees(Integer degrees) {
        this.degrees = degrees;
    }

    @JsonProperty("Localized")
    public String getLocalized() {
        return localized;
    }

    @JsonProperty("Localized")
    public void setLocalized(String localized) {
        this.localized = localized;
    }

    @JsonProperty("English")
    public String getEnglish() {
        return english;
    }

    @JsonProperty("English")
    public void setEnglish(String english) {
        this.english = english;
    }

}
