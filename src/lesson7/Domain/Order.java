package lesson7.Domain;

import java.util.Date;

public class Order {

    public Date date;

    public String address;

    public String food;

    public Order(Date date, String address, String food){

        this.date = date;
        this.address = address;
        this.food = food;
    }
}
