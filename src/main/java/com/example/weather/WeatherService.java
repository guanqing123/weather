package com.example.weather;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/5/19 20:34
 **/
public class WeatherService {

    private WeatherSource weatherSource;

    public WeatherService(WeatherSource weatherSource) {
        this.weatherSource = weatherSource;
    }

    public String getType(){
        return weatherSource.getType();
    }

    public String getRate(){
        return weatherSource.getRate();
    }
}
