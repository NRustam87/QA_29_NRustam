package lesson7.Impl;

import lesson7.Domain.Order;
import lesson7.Service.OrderDelivery;

public class OrderDeleviryImpl implements OrderDelivery {

    @Override
    public void delivery(Order order) {
        System.out.println("deleviry");
    }
}
