/**
 * Create methods to convert temperature from Celsius to Fahrenhit and vice
 * versa. Take temperature input from user and call the appropriate conversion
 * method.
 */

public class PRO36 {
    public static void main(String[] args) {
        TemperatureConverter tc = new TemperatureConverter();

        System.out.println(tc.celsiusToFahrenheit(12)); // 12°C = 53.600°F
        System.out.println(tc.fahrenheitToCelsius(53.600)); // 12°C = 53.600°F
    }
}

class TemperatureConverter {
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
