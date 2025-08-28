public class EmployeeSalarySlip {
    public static void func(String[] names){
        int[] basic = {30000, 60000, 45000};
        for (int i = 0; i < names.length; i++) {
            double hra = 0.20 * basic[i];
            double da = 0.10 * basic[i];
            double net = basic[i] + hra + da;

            if (net > 50000) {
                net = net - (0.10 * net); 
            }

            System.out.println("\nSalary Slip for " + names[i]);
            System.out.println("Basic Salary: " + basic[i]);
            System.out.println("HRA (20%): " + hra);
            System.out.println("DA (10%): " + da);
            System.out.println("Net Salary: " + net);
        }
    }
    public static void main(String[] args) {
        String[] names = {"Raj", "Neha", "Amit"};
        func(names);
    }
}

