import java.util.ArrayList;
import java.util.List;

public class ProductService {

   static List<Product> listProducts;
static {
    listProducts = new ArrayList<>();
    Product product = new Product("thit bo",1,1000);
    Product product1 = new Product("thit ga",2,1600);
    listProducts.add(product);
    listProducts.add(product1);
}



    public void add(Product newProduct) {
        for (int i = 0; i <listProducts.size(); i++) {
            if (newProduct.getId() == listProducts.get(i).getId()) {
                listProducts.add(newProduct);
            }
        }

    }

}
