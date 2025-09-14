// Base class: Order
class Order {
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order placed on " + orderDate;
    }
}

// Subclass: ShippedOrder
class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order shipped (Tracking No: " + trackingNumber + ")";
    }
}

// Subclass: DeliveredOrder (multilevel inheritance)
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }
}

// Main class
public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        Order o1 = new Order(101, "2025-09-10");
        ShippedOrder o2 = new ShippedOrder(102, "2025-09-11", "TRK12345");
        DeliveredOrder o3 = new DeliveredOrder(103, "2025-09-12", "TRK67890", "2025-09-14");

        System.out.println("Order 1 Status: " + o1.getOrderStatus());
        System.out.println("Order 2 Status: " + o2.getOrderStatus());
        System.out.println("Order 3 Status: " + o3.getOrderStatus());
    }
}
