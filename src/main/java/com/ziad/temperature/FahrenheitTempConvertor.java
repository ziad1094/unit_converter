package com.ziad.temperature;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FahrenheitTempConvertor implements TemperatureConvertor{

    @Override
    public double convert(CelciousTempUnit u) {
        BigDecimal bigDecimal = new BigDecimal((u.getValue() * 9/5) + 32).setScale(2, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }

    @Override
    public double convert(KelvinTempUnit u) {
        BigDecimal bigDecimal = new BigDecimal((u.getValue() - 273.15) * 9/5 + 32).setScale(2, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }

    @Override
    public double convert(FahrenheitTempUnit u) {
        return u.getValue();
    }
    
}
