package Lesson6.Task1;

public class Main {
    public static void main(String[] args) {

        Product[] list = {
                new Product("телек", Type.TV, 3000),
                new Product("плеер", Type.AUDIO, 1000),
                new Product("телефон", Type.MOBILE, 2000),
                new Product("телек2", Type.TV, 4000),
                new Product("плеер2", Type.AUDIO, 5000),
                new Product("телефон2", Type.MOBILE, 6000),
        };

        ProductService service = new ProductService();
        System.out.println(service.costAllProduct(list, Type.TV));

        Product[] list1 = {
                new Product("телек", Type.TV, 3000, true),
                new Product("плеер", Type.AUDIO, 1000, false),
                new Product("телефон", Type.MOBILE, 2000, false),
                new Product("телек2", Type.TV, 4000, true),
                new Product("плеер2", Type.AUDIO, 5000, false),
                new Product("телефон2", Type.MOBILE, 6000, false)
        };

        System.out.println(service.allProductInStock(list1, Type.TV));
    }
}