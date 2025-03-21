package com.ziad.commands;

import java.util.function.Function;

import com.ziad.registry.TemperatureRegistry;
import com.ziad.temperature.TemperatureConvertor;
import com.ziad.temperature.TemperatureUnit;

public class TemperatureCommand implements Command{

    private String initial;
    private String target;
    private double value;

    public TemperatureCommand(String initial, String target, double value){
        this.initial = initial;
        this.target = target;
        this.value = value;
    }

    @Override
    public double execute() {

        Function<Void, TemperatureConvertor> tempConvFunction = TemperatureRegistry.getConverterFactory(target.toLowerCase());
        Function<Double, TemperatureUnit> tempUnitFunction = TemperatureRegistry.getUnitFactory(initial.toLowerCase());

        TemperatureConvertor tempConv = null;
        TemperatureUnit tempUnit = null;

        if(tempConvFunction == null || tempUnitFunction == null){
            throw new RuntimeException("unsupported unit(s)!");
        }
        else{
            tempConv = tempConvFunction.apply(null);
            tempUnit = tempUnitFunction.apply(value);
        }

        return tempUnit.use(tempConv);
    }
    
}
