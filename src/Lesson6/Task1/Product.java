package Lesson6.Task1;

public class Product {

    private int cost;

    public Type type;

    private String name;

    private boolean availability;

    public void setName(String name) {
        this.name = name;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public boolean isAvailability() {
        return availability;
    }

    public Product(String name, Type type, int cost)
    {
        this.name = name;
        this.cost = cost;
        this.type = type;
    }

    public Product(String name, Type type, int cost, boolean availability)
    {
        this.name = name;
        this.cost = cost;
        this.type = type;
        this.availability = availability;
    }

    public Product(){}

}
