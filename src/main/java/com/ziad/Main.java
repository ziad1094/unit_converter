package com.ziad;

import com.ziad.commands.Command;
import com.ziad.commands.CommandFactory;
import com.ziad.registry.TemperatureRegistry;
import com.ziad.registry.WeightRegistry;

public class Main {

    //a method to check the user input command to avoid any unnecessary problems
    private static boolean checkCommand(String[] args){

        //the command is always of length 4
        if (args.length != 4) return false;

        String category = args[0].toLowerCase();
        String initialUnit = args[2].toLowerCase();
        String targetUnit = args[3].toLowerCase();

        if (category.equals("temperature")) {
            return TemperatureRegistry.getUnitFactory(initialUnit) != null &&
                TemperatureRegistry.getConverterFactory(targetUnit) != null;
        } else if (category.equals("weight")) {
            return WeightRegistry.getUnitFactory(initialUnit) != null &&
                WeightRegistry.getConverterFactory(targetUnit) != null;
        }

        return false;
    }

    public static void main(String[] args) {

        if(args.length == 0){
            String message = """
                    welcome to unit converter!
                    command structure: 
                    <unit category> <value> <intial unit> <target unit>
                    available measurements units: 
                    Temperature: 
                        celsius
                        kelvin
                        fahrenheit
                    Weight:
                        kilogram
                        pound
                    """;
            System.out.println(message);
        }
        else if(!checkCommand(args)){
            System.out.println("Incomplete or invalid command!");
        }
        else{
            Command command = CommandFactory.createCommand(UnitCategory.valueOf(args[0].toUpperCase()), args[2], args[3], Double.parseDouble(args[1]));
            System.out.println(args[1] + " " +  args[2] + " is equivalent to " + command.execute() + " " + args[3]);
        }
        
    }
}