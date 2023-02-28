package edu.escuelaing.ieti.app.repository.Dto;

import org.springframework.data.annotation.Id;

public class WeatherDto {

    Float temp;

    Float pressure;

    Float humidity;

    public WeatherDto() {
    }

    public Float getTemp() {
        return temp;
    }

    public void setTemp(Float temp) {
        this.temp = temp;
    }

    public Float getPressure() {
        return pressure;
    }

    public void setPressure(Float pressure) {
        this.pressure = pressure;
    }

    public Float getHumidity() {
        return humidity;
    }

    public void setHumidity(Float humidity) {
        this.humidity = humidity;
    }
}
