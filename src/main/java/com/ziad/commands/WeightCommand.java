package com.ziad.commands;

import java.util.function.Function;

import com.ziad.registry.WeightRegistry;
import com.ziad.weight.WeightConverter;
import com.ziad.weight.WeightUnit;

public class WeightCommand implements Command{

    private String initial;
    private String target;
    private double value;

    public WeightCommand(String initial, String target, double value){
        this.initial = initial;
        this.target = target;
        this.value = value;
    }

    @Override
    public double execute() {
        Function<Void, WeightConverter> weightConvFunction = WeightRegistry.getConverterFactory(target.toLowerCase());
        Function<Double, WeightUnit> weightUnitFunction = WeightRegistry.getUnitFactory(initial.toLowerCase());

        WeightConverter weightConv = null;
        WeightUnit weightUnit = null;

        if(weightConvFunction == null || weightUnitFunction == null){
            throw new RuntimeException("unsupported unit(s)!");
        }
        else{
            weightConv = weightConvFunction.apply(null);
            weightUnit = weightUnitFunction.apply(value);
        }

        return weightUnit.use(weightConv);
    }
    
}
