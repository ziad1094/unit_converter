package com.ziad.temperature;

public class FahrenheitTempUnit implements TemperatureUnit{

    private double value;

    public FahrenheitTempUnit(double value){
        this.value = value;
    }

    @Override
    public double use(TemperatureConvertor TempConv) {
        return TempConv.convert(this);
    }

    @Override
    public double getValue() {
        return this.value;
    }
    
}
