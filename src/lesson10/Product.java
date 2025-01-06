package lesson10;

import java.util.List;

public class Product {

    private String name;
    private int cost;
    private int itemCount;

    public Product(String name, int itemCount, int cost) {
        this.name = name;
        this.itemCount = itemCount;
        this.cost = cost;
    }

    public void exceedingCost(List<Product> list, int cost){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getCost() >= cost){
                System.out.println(list.get(i).getName());
            }
        }
    }

    public void searchProduct(List<Product> list, String name){
        for(Product test : list)
            if (test.getName() == name) System.out.println(name);
            else System.out.println("Nothing was found");
    }

    public void calculateItemCount(List<Product> listProduct){
        int count = 0;
        for(int i = 0; i< listProduct.size(); i++){
            count = count + listProduct.get(i).getItemCount();
        }
        System.out.println(count);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int count) {
        this.itemCount = count;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
