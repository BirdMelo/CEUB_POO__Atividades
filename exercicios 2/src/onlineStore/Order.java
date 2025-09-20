package onlineStore;

public class Order {
    private int number;
    private OrderItem orderItem;

    public Order(int number, OrderItem orderItem) {
        this.number = number;
        this.orderItem = orderItem;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }
}
