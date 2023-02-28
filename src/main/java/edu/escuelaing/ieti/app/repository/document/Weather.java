package edu.escuelaing.ieti.app.repository.document;

import edu.escuelaing.ieti.app.repository.Dto.WeatherDto;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Weather {

    Float temp;

    Float pressure;

    Float humidity;

    public Weather() {
    }

    public Weather(Float temp, Float pressure, Float humidity) {
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public Weather(WeatherDto weatherDto){
        this.humidity = weatherDto.getHumidity();
        this.temp = weatherDto.getTemp();
        this.pressure = weatherDto.getPressure();
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

