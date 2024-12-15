package Lesson6.Task1;

public class ProductService {

    public int costAllProduct(Product[] products, Type type){
        int value = 0;
        for(Product product : products){
            if(product.type == type)
            {
                value = value + product.getCost();
            }
        }

        return value;
    }

    public int allProductInStock(Product[] products, Type type){
        int count = 0;
        for(Product product : products){
            if(product.isAvailability())
            {
                count++;
            }
        }

        return count;
    }
}
