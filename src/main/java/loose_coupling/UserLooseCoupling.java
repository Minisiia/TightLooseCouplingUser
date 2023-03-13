package loose_coupling;

import loose_coupling.interfaces.Order;

public class UserLooseCoupling {
    private String name;
    private Order order;

    public UserLooseCoupling() {
    }

    public UserLooseCoupling(String name, Order order) {
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
