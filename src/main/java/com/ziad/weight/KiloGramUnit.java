package com.ziad.weight;

public class KiloGramUnit implements WeightUnit{

    private double value;

    public KiloGramUnit(double value){
        this.value = value;
    }

    @Override
    public double use(WeightConverter weightConv) {
        return weightConv.convert(this);
    }

    @Override
    public double getValue() {
        return this.value;
    }
    
}
