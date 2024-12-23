package lesson7.Impl;

import lesson7.Domain.Order;
import lesson7.Service.OrderProcessing;

public class OrderProcessingImpl implements OrderProcessing {

    @Override
    public void processing(Order order) {
        System.out.println("processing");
    }
}
