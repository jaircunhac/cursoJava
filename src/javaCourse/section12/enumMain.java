package javaCourse.section12;

import javaCourse.section12.entities.Order;
import javaCourse.section12.entities.enums.OrderStatus;

import java.util.Date;

public class enumMain {
    public static void main(String[] args) {
        Order order = new Order(1080, OrderStatus.PENDING_PAYMENT, new Date());

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
