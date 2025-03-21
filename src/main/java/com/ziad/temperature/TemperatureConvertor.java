package com.ziad.temperature;

public interface TemperatureConvertor {
    public double convert(CelciousTempUnit u);
    public double convert(KelvinTempUnit u);
    public double convert(FahrenheitTempUnit u);
}
