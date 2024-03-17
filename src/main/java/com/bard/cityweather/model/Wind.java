
package com.bard.cityweather.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Direction",
    "Speed"
})
public class Wind {

    @JsonProperty("Direction")
    private Direction direction;
    @JsonProperty("Speed")
    private Speed speed;

    @JsonProperty("Direction")
    public Direction getDirection() {
        return direction;
    }

    @JsonProperty("Direction")
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    @JsonProperty("Speed")
    public Speed getSpeed() {
        return speed;
    }

    @JsonProperty("Speed")
    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

}
