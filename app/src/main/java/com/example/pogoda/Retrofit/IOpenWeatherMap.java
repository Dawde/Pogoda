package com.example.pogoda.Retrofit;

import com.example.pogoda.Model.WeatherResult;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IOpenWeatherMap {
    @GET("weather")
    Observable<WeatherResult> getWeatherBy(@Query("q") String q,
                                           @Query("appid") String appid,
                                           @Query("units") String unit);

}
