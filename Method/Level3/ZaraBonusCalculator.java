public class ZaraBonusCalculator {

    // Method to generate salary and years of service
    public static int[][] generateEmployeeData(int count) {
        int[][] data = new int[count][2]; // [][0] = salary, [][1] = years of service
        for (int i = 0; i < count; i++) {
            int salary = (int)(Math.random() * 90000) + 10000; // 5-digit salary
            int years = (int)(Math.random() * 10) + 1; // 1 to 10 years
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    // Method to calculate bonus and new salary
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        double[][] result = new double[employeeData.length][2]; // [][0] = bonus, [][1] = new salary
        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonusRate = years > 5 ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;
            result[i][0] = bonus;
            result[i][1] = newSalary;
        }
        return result;
    }

    // Method to display results and totals
    public static void displayResults(int[][] employeeData, double[][] bonusData) {
        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        System.out.printf("%-10s %-12s %-10s %-10s %-12s\n", "EmpID", "Old Salary", "Years", "Bonus", "New Salary");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = bonusData[i][0];
            double newSalary = bonusData[i][1];

            totalOldSalary += salary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            System.out.printf("%-10d %-12d %-10d %-10.2f %-12.2f\n", (i + 1), salary, years, bonus, newSalary);
        }

        System.out.println("---------------------------------------------------------------");
        System.out.printf("TOTALS     %-12.2f %-10s %-10.2f %-12.2f\n",
                totalOldSalary, "", totalBonus, totalNewSalary);
    }

    // Main method
    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData(10);
        double[][] bonusData = calculateBonusAndNewSalary(employeeData);
        displayResults(employeeData, bonusData);
    }
}
