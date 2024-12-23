package lesson7.Impl;

import lesson7.Domain.Order;
import lesson7.Service.ReceivingOrder;

public class ReceivingOrderOnline implements ReceivingOrder {

    @Override
    public void receiving(Order order) {
        System.out.println("Заказ принят онлайн");
    }
}
