package com.ziad.commands;

import com.ziad.UnitCategory;

public class CommandFactory {

    public static Command createCommand(UnitCategory category, String initial, String target, double value){
        
        switch (category) {
            case TEMPERATURE:
                return new TemperatureCommand(initial, target, value);
            case WEIGHT:
                return new WeightCommand(initial, target, value);
            default:
                return null;
        }
    }
}
