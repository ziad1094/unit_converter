# Unit-converter

A simple command-line unit converter to convert between different measurement units.
Project idea belongs to [roadmap.sh](https://roadmap.sh/projects/unit-converter)

## 🚀 Features

- Extensible Design – Built with flexibility in mind, allowing relatively easy addition of new measurement units.
- Utilizes Multiple Design Patterns:
    - Factory Method – Ensures proper instantiation of unit objects.
    - Visitor Pattern – Enables dynamic unit conversion without modifying existing classes.
    - Command Pattern – Encapsulates conversion operations as reusable commands.
    - Registry Pattern – Manages unit and converter mappings for clean and efficient lookups.
- Supports Multiple Measurement Categories – Easily extendable to temperature, weight, and more.

## 👷 Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/ziad1094/unit_converter
   ```
2. Compile and run the program through Main method.

## 🛠️ Usage

Run the converter using the following syntax: 

```sh
unit-converter <unit category> <value> <initial unit> <target unit>
```

## 🧻 Available measurement units: 

- Temperature:
  - celsius
  - kelvin
  - fahrenheit
- Weight:
  - kilogram
  - pound

## ⚠️ Notes:

- You can also use the unit-converter.exe file.
- The application might not be rich in terms of unit measurements, since the purpose was to apply different design patterns and adhere to SOLID principles.

## 🤝 Contributing

If you'd like to improve unit-converter, feel free to fork the repo and submit a pull request.

## 📜 License

This project is licensed under the MIT License.