public class UnitConvertor {

    public static double convertFarhenheitToCelsius(double farhenheit) {
        return (farhenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFarhenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        // Sample usage
        double f = 98.6;
        System.out.println(f + "°F = " + convertFarhenheitToCelsius(f) + "°C");

        double c = 37;
        System.out.println(c + "°C = " + convertCelsiusToFarhenheit(c) + "°F");

        double pounds = 150;
        System.out.println(pounds + " pounds = " + convertPoundsToKilograms(pounds) + " kilograms");

        double kg = 68;
        System.out.println(kg + " kilograms = " + convertKilogramsToPounds(kg) + " pounds");

        double gallons = 5;
        System.out.println(gallons + " gallons = " + convertGallonsToLiters(gallons) + " liters");

        double liters = 18.9;
        System.out.println(liters + " liters = " + convertLitersToGallons(liters) + " gallons");
    }
}
