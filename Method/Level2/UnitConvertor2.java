public class UnitConvertor2 {
    


    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        // Sample usage
        double yards = 5;
        System.out.println(yards + " yards = " + convertYardsToFeet(yards) + " feet");

        double feet = 15;
        System.out.println(feet + " feet = " + convertFeetToYards(feet) + " yards");

        double meters = 2;
        System.out.println(meters + " meters = " + convertMetersToInches(meters) + " inches");

        double inches = 50;
        System.out.println(inches + " inches = " + convertInchesToMeters(inches) + " meters");
        System.out.println(inches + " inches = " + convertInchesToCentimeters(inches) + " centimeters");
    }
}