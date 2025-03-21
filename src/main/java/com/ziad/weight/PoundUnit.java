package com.ziad.weight;

public class PoundUnit implements WeightUnit{

    private double value;

    public PoundUnit(double value){
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
