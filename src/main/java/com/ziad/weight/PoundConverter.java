package com.ziad.weight;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PoundConverter implements WeightConverter{

    @Override
    public double convert(PoundUnit u) {
        return u.getValue();
    }

    @Override
    public double convert(KiloGramUnit u) {
        BigDecimal bigDecimal = new BigDecimal(u.getValue() * 2.20462).setScale(3, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }
    
}
