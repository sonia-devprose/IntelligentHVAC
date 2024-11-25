# Intelligent HVAC System

This project demonstrates a simple simulation of an **Intelligent Heating, Ventilation, and Air Conditioning (HVAC) System** implemented in Java. The system dynamically adjusts the temperature, monitors humidity, and evaluates air quality to optimize environmental conditions within a room.

## Features

- **Temperature Control**: Automatically adjusts the room temperature to match the target temperature.  
  - Activates heating if the temperature is too low.
  - Activates cooling if the temperature is too high.

- **Humidity Monitoring**: Activates a humidifier if the room's humidity exceeds a specified threshold.

- **Air Quality Assessment**: Shuts down all operations if air quality falls below safe levels.

- **Binary Operation Modes**: Utilizes bitwise operations to represent and manage different HVAC states:
  - `0b0001` - Heating mode.
  - `0b0010` - Cooling mode.
  - `0b0100` - Humidity control.

## Usage

The system is a console-based simulation and can be run with default parameters for:
- Initial temperature: `15°C`
- Target temperature: `25°C`
- Room humidity: `65%`
- Air quality: `45%`

Modify the initial conditions directly in the source code to simulate different scenarios.

## Output

The program provides real-time feedback on:
- Adjusted temperature.
- Activated HVAC modes (Heating, Cooling, Humidifying).
- Error handling for unsafe air quality.
