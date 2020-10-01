import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static void display(List<Product> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }






    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ProductService productService = new ProductService();
        Product product = new Product("ok", 3, 1999);
        ProductService.listProducts.add(product);
//        display(ProductService.listProducts);
//        for (Product product2 : listProducts) {
//            System.out.println(product2);
//        }

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("Object.txt")));
        objectOutputStream.writeObject(ProductService.listProducts);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Object.txt"));
        ArrayList<Product> product2 =(ArrayList) objectInputStream.readObject();
        System.out.println(product2.toString());
    }
}
