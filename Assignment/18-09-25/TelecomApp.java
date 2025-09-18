import java.util.*;

abstract class Plan {
    protected final String mobileNumber;
    protected double balance;
    protected UsageDetails usage;

    public Plan(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        this.balance = 0;
        this.usage = new UsageDetails();
    }

    public abstract void recharge(double amount);
    public abstract void checkBalance();

    public String getMobileNumber() { return mobileNumber; }

    class DataPack {
        private double dataAmount;
        private double cost;

        public DataPack(double dataAmount, double cost) {
            this.dataAmount = dataAmount;
            this.cost = cost;
        }

        public void activate() {
            usage.addData(dataAmount);
            balance -= cost;
            System.out.println("Activated " + dataAmount + "GB for " + mobileNumber + ", Cost: " + cost);
        }
    }
}

class UsageDetails {
    private int callMinutes;
    private int smsCount;
    private double dataGB;

    public void addCalls(int minutes) { callMinutes += minutes; }
    public void addSMS(int sms) { smsCount += sms; }
    public void addData(double gb) { dataGB += gb; }

    public int getCallMinutes() { return callMinutes; }
    public int getSMSCount() { return smsCount; }
    public double getDataGB() { return dataGB; }
}

interface Rechargeable {
    void recharge(double amount);
    void checkBalance();
}

class PrepaidPlan extends Plan implements Rechargeable {
    public static double networkTaxPercent = 5.0;

    public PrepaidPlan(String mobileNumber) { super(mobileNumber); }

    @Override
    public void recharge(double amount) {
        balance += amount;
        System.out.println("PrepaidPlan recharged with " + amount + " for " + mobileNumber);
    }

    @Override
    public void checkBalance() {
        System.out.println("PrepaidPlan balance for " + mobileNumber + ": " + balance);
    }

    public void useCall(int minutes) {
        usage.addCalls(minutes);
        balance -= minutes;
    }

    public void useSMS(int sms) {
        usage.addSMS(sms);
        balance -= sms * 0.5;
    }

    public void useData(double gb) {
        usage.addData(gb);
        balance -= gb * 10;
    }
}

class PostpaidPlan extends Plan implements Rechargeable {
    public static double networkTaxPercent = 5.0;

    public PostpaidPlan(String mobileNumber) { super(mobileNumber); }

    @Override
    public void recharge(double amount) {
        System.out.println("PostpaidPlan does not support recharge. Bill will include usage charges.");
    }

    @Override
    public void checkBalance() {
        System.out.println("PostpaidPlan current usage balance for " + mobileNumber + ": " + balance);
    }

    public void useCall(int minutes) { usage.addCalls(minutes); }
    public void useSMS(int sms) { usage.addSMS(sms); }
    public void useData(double gb) { usage.addData(gb); }
}

class Customer {
    private String customerId;
    private String name;
    private List<Plan> plans = new ArrayList<>();

    public Customer(String id, String name) {
        this.customerId = id;
        this.name = name;
    }

    public void addPlan(Plan plan) {
        plans.add(plan);
        System.out.println(name + " added plan for " + plan.getMobileNumber());
    }

    public List<Plan> getPlans() { return plans; }
    public String getName() { return name; }
}

class BillingSystem {
    public static void generateMonthlyBill(Customer c) {
        System.out.println("\n--- Monthly Bill for " + c.getName() + " ---");
        for (Plan plan : c.getPlans()) {
            double callCharges = plan.usage.getCallMinutes() * 1;
            double smsCharges = plan.usage.getSMSCount() * 0.5;
            double dataCharges = plan.usage.getDataGB() * 10;

            double subtotal = callCharges + smsCharges + dataCharges;
            double tax = subtotal * PrepaidPlan.networkTaxPercent / 100;
            double total = subtotal + tax;

            System.out.println("Mobile: " + plan.getMobileNumber());
            System.out.println("Calls: " + plan.usage.getCallMinutes() + " min, SMS: " + plan.usage.getSMSCount() +
                    ", Data: " + plan.usage.getDataGB() + "GB");
            System.out.println("Subtotal: " + subtotal + ", Tax: " + tax + ", Total: " + total + "\n");
        }
    }
}

public class TelecomApp {
    public static void main(String[] args) {
        Customer alice = new Customer("C001", "Alice");
        Customer bob = new Customer("C002", "Bob");

        PrepaidPlan prepaid1 = new PrepaidPlan("9876543210");
        PostpaidPlan postpaid1 = new PostpaidPlan("9123456780");

        alice.addPlan(prepaid1);
        bob.addPlan(postpaid1);

        prepaid1.recharge(200);
        prepaid1.useCall(50);
        prepaid1.useSMS(20);
        prepaid1.useData(5);

        postpaid1.useCall(100);
        postpaid1.useSMS(50);
        postpaid1.useData(10);

        PrepaidPlan.DataPack pack = prepaid1.new DataPack(2, 50);
        pack.activate();

        prepaid1.checkBalance();
        postpaid1.checkBalance();

        BillingSystem.generateMonthlyBill(alice);
        BillingSystem.generateMonthlyBill(bob);
    }
}
