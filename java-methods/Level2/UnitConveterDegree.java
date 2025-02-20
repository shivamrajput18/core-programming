// Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g. 
// public static double convertFarhenheitToCelsius(double farhenheit) => 
// Method to convert Fahrenheit to Celsius and return the value. Use the following code  double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
// Method to convert Celsius to Fahrenheit and return the value. Use the following code  double celsius2farhenheit = (celsius * 9 / 5) + 32;
// Method to convert pounds to kilograms and return the value. Use the following code  double pounds2kilograms = 0.453592;
// Method to convert kilograms to pounds and return the value. Use the following code  double kilograms2pounds = 2.20462; 
// Method to convert gallons to liters and return the value. Use following code to convert   double gallons2liters = 3.78541; 
// Method to convert liters to gallons and return the value. Use following code to convert  double liters2gallons = 0.264172; 


public class UnitConveterDegree {
    public static double convertFarhenheitToCelsius(double farhenheit) {
        return (farhenheit - 32) * 5 / 9;
    } 

    public static double convertCelsiusToFarhenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    
    public static void main(String[] args) {
        System.out.println("32 Fahrenheit to Celsius: " + convertFarhenheitToCelsius(32));
        System.out.println("0 Celsius to Fahrenheit: " + convertCelsiusToFarhenheit(0));
        System.out.println("10 Pounds to Kilograms: " + convertPoundsToKilograms(10));
        System.out.println("10 Kilograms to Pounds: " + convertKilogramsToPounds(10));
        System.out.println("10 Gallons to Liters: " + convertGallonsToLiters(10));
        System.out.println("10 Liters to Gallons: " + convertLitersToGallons(10));
    }
}
