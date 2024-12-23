package lesson7.Impl;

import lesson7.Domain.Order;
import lesson7.Service.OrderData;
import lesson7.Service.OrderDelivery;
import lesson7.Service.OrderProcessing;
import lesson7.Service.ReceivingOrder;

public class OrderHandler implements lesson7.Service.OrderHandler {

    private final OrderData data;
    private final OrderDelivery delivery;
    private final OrderProcessing processing;
    private final ReceivingOrder receiveOrder;

    public OrderHandler(OrderData data, OrderDelivery delivery, OrderProcessing processing, ReceivingOrder receiveOrder)
    {
        this.data = data;
        this.delivery = delivery;
        this.processing = processing;
        this.receiveOrder = receiveOrder;
    }

    @Override
    public void register(Order order) {
        System.out.println("step1: ReceivingOrder");
        receiveOrder.receiving(order);

        System.out.println("step2: OrderData");
        data.save(order);

        System.out.println("step3: processing");
        processing.processing(order);

        System.out.println("step4: delivery");
        delivery.delivery(order);
    }
}
