package com.painter;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import java.time.Duration;
import java.time.LocalDateTime;

public class Kettle {
    ///////////////////////////////////Attributes//////////////////////////
    private int currentVolume;
    private int maxVolume;
    private int temperature;
    private LocalDateTime timeOfTemperature;

//////////////////////////////////////Constructor//////////////////////////
public Kettle(){
    currentVolume=0;
    maxVolume = 1700;
    temperature = 16;
    timeOfTemperature = LocalDateTime.now();
}





////////////////////////////////////Methods//////////////////////////////
    public void boilKettle(){
        temperature = 100;
        timeOfTemperature =  LocalDateTime.now();

    }
    public int getTemperature(){
        temperature = rateOfCooling();
        return temperature;

    }
    public int rateOfCooling(){
        Duration numberOfSeconds = Duration.between(LocalDateTime.now(), timeOfTemperature);
        Long getSeconds = numberOfSeconds.getSeconds();
        int currentTemp = (int)(temperature - (getSeconds*10));
        if (currentTemp<16){
            currentTemp = 16;
        }
        timeOfTemperature = LocalDateTime.now();
        return currentTemp;
    }
}
