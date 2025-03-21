package com.ziad.registry;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import com.ziad.temperature.*;

public class TemperatureRegistry {

    private static Map<String, Function<Double, TemperatureUnit>> temperatureUnitCommands = new HashMap<>();
    private static Map<String, Function<Void, TemperatureConvertor>> temperatureConverterCommands = new HashMap<>();

    static{
        temperatureUnitCommands.put("celsius", value -> new CelciousTempUnit(value));
        temperatureUnitCommands.put("kelvin", value -> new KelvinTempUnit(value));
        temperatureUnitCommands.put("fahrenheit", value -> new FahrenheitTempUnit(value));

        temperatureConverterCommands.put("celsius", Void -> new CelciousTempConvertor());
        temperatureConverterCommands.put("kelvin", Void -> new KelvinTempConvertor());
        temperatureConverterCommands.put("fahrenheit", Void -> new FahrenheitTempConvertor());
    }

    //useless method since we're doing the registring manually anyway XD
    public static void registerUnit(String unitName, Function<Double, TemperatureUnit> factory){
        temperatureUnitCommands.put(unitName, factory);
    }

    //useless method since we're doing the registring manually anyway XD
    public static void registerConverter(String converterName, Function<Void, TemperatureConvertor> factory){
        temperatureConverterCommands.put(converterName, factory);
    }

    public static Function<Double, TemperatureUnit> getUnitFactory(String unitName){
        return temperatureUnitCommands.get(unitName);
    }

    public static Function<Void, TemperatureConvertor> getConverterFactory(String converterName){
        return temperatureConverterCommands.get(converterName);
    }
}
