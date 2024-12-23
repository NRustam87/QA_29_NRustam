package lesson7.Impl;

import lesson7.Domain.Order;
import lesson7.Service.OrderData;

public class OrderDataImpl implements OrderData {

    @Override
    public void save(Order order) {
        System.out.println("Save order");
    }
}
