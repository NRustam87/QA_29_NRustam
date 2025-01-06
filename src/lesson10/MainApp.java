package lesson10;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        Product sony = new Product("Sony", 10, 100);
        Product panasonic = new Product("Panaconic", 50, 70);
        Product apple = new Product("Apple", 30, 150);

        List<Product> listProducts= new ArrayList<>();
        listProducts.add(sony);
        listProducts.add(panasonic);
        listProducts.add(apple);

        Product mi = new Product("Mi", 40, 60);
        listProducts.add(1, mi);

        System.out.println(listProducts.size());

        System.out.println(listProducts.contains(mi));

        for (Product element : listProducts){
            System.out.println(element.getName());
        }

        var list = listProducts.reversed();

        for (Product element : list){
            System.out.println(element.getName());
        }
    }
}
