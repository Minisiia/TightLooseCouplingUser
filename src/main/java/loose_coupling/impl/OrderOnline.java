package loose_coupling.impl;

import loose_coupling.interfaces.Order;

public class OrderOnline implements Order {
    private long id;
    private String description;

    public OrderOnline() {
    }

    public OrderOnline(long id, String description) {
        this.id = id;
        this.description = description;
    }

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "OrderOnline{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
