package lesson7.Service;

import lesson7.Domain.Order;

public interface OrderDelivery {

    void delivery(Order order);

    default void getWindow(Order order){
        System.out.println("Без доставки, самовывоз");
    };
}
