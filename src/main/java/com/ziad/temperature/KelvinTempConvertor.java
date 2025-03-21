package com.ziad.temperature;

import java.math.BigDecimal;
import java.math.RoundingMode;

//the name of the class means that this class will convert any temperature unit to the unit mentioned in the name
public class KelvinTempConvertor implements TemperatureConvertor{

    @Override
    public double convert(CelciousTempUnit u) {
        BigDecimal bigDecimal = new BigDecimal(u.getValue() + 273.15).setScale(2, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }

    @Override
    public double convert(KelvinTempUnit u) {
        return u.getValue();
    }

    @Override
    public double convert(FahrenheitTempUnit u) {
        BigDecimal bigDecimal = new BigDecimal((u.getValue() - 32) * 5/9 + 273.15).setScale(2, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }
    
}
