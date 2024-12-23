package lesson7;

import lesson7.Domain.Order;
import lesson7.Impl.OrderDataImpl;
import lesson7.Impl.OrderDeleviryImpl;
import lesson7.Impl.OrderProcessingImpl;
import lesson7.Impl.ReceivingOrderOnline;
import lesson7.Service.*;

import java.util.Calendar;

public class MainApp {
    public static void main(String[] args){

        Order order = new Order(Calendar.getInstance().getTime(), "123 Maple Street", "Burger");

        OrderHandler handler = new lesson7.Impl.OrderHandler(
                new OrderDataImpl(),
                new OrderDeleviryImpl(),
                new OrderProcessingImpl(),
                new ReceivingOrderOnline()
        );

        handler.register(order);
    }
}
