package action.product;

import io.HandleFile;
import model.Product;

public class List {
    public static void show(String pathProducts) {
        java.util.List<Product> products = HandleFile.readDataFromFile(pathProducts);
        System.out.println(products);
    }
}
