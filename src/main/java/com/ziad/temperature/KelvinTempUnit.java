package com.ziad.temperature;

public class KelvinTempUnit implements TemperatureUnit{

    private double value;

    public KelvinTempUnit(double value){
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
