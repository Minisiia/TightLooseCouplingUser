package tight_coupling;

public class UserTightCoupling {
    private String name;
    private Order order;

    public UserTightCoupling() {
    }

    public UserTightCoupling(String name, Order order) {
        this.name = name;
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", order=" + order +
                '}';
    }
}
