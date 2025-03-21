package com.ziad.registry;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import com.ziad.weight.*;

public class WeightRegistry {
    
    private static Map<String, Function<Double, WeightUnit>> weightUnitCommands = new HashMap<>();
    private static Map<String, Function<Void, WeightConverter>> weightConverterCommands = new HashMap<>();

    static{
        weightUnitCommands.put("kilogram", value -> new KiloGramUnit(value));
        weightUnitCommands.put("pound", value -> new PoundUnit(value));

        weightConverterCommands.put("kilogram", Void -> new KiloGramConverter());
        weightConverterCommands.put("pound", Void -> new PoundConverter());
    }

    //useless method since we're doing the registring manually anyway XD
    public static void registerUnit(String unitName, Function<Double, WeightUnit> factory){
        weightUnitCommands.put(unitName, factory);
    }

    //useless method since we're doing the registring manually anyway XD
    public static void registerConverter(String converterName, Function<Void, WeightConverter> factory){
        weightConverterCommands.put(converterName, factory);
    }

    public static Function<Double, WeightUnit> getUnitFactory(String unitName){
        return weightUnitCommands.get(unitName);
    }

    public static Function<Void, WeightConverter> getConverterFactory(String converterName){
        return weightConverterCommands.get(converterName);
    }
}
