package com.example.intelligenthvac;

public class IntelligentHvac {

    public static void main (String [] args)
    {
        // Intelligent Heating, Ventilation, and Air Conditioning System
        // Temperature in Celsius
        int currentTemperature = 15;
        int targetTemperature = 25;

        // In percentage
        int roomHumidity = 65;
        int airQuality = 45;

        // Initial mode: no operations
        int operationMode = 0b0000;

        // Temperature adjustment
        while (currentTemperature != targetTemperature)
        {
            if (currentTemperature < targetTemperature)
            {
                currentTemperature++;
                operationMode |= 0b0001; // Heating
            }
                else
                {
            currentTemperature --;
            operationMode |= 0b0010; // Cooling

            }
        }




        System.out.println("The current temperature is adjusted to: " + currentTemperature + "°C");

        if ((operationMode & 0b0001) != 0)
        {
            System.out.println("Heating mode is on!");
        }
        else if ((operationMode & 0b0010) != 0)
        {
            System.out.println("Cooling mode is on!");
        }
        else if ((operationMode == 0b0000))
        {
            System.out.println("Idle");
        }

        else
        {
            System.out.println("Error!");
        }
        // Humidity control logic
        if (roomHumidity > 60)
        {
            operationMode |= 0b00100;
            System.out.println("Activating humidifier");
        }

        if (airQuality < 50)
        {
            operationMode = 0b0000;
            System.out.print("Air quality unsafe, deactivating all operations.");
        }





    }
}
