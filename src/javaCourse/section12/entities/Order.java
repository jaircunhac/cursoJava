package javaCourse.section12.entities;

import javaCourse.section12.entities.enums.OrderStatus;

import java.util.Date;

public class Order {

    private Integer id;
    private OrderStatus status;
    private Date moment;

    public Order(){
    }

    public Order(Integer id, OrderStatus status, Date moment) {
        this.id = id;
        this.status = status;
        this.moment = moment;
    }
}
