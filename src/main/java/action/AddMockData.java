package action;

import common.Constains;
import io.HandleFile;
import model.Product;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class AddMockData {
    public static void executeUser() {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Test01", "test01@gmail.com", "123456", "admin"));
        users.add(new User(2, "Test02", "test02@gmail.com", "123123", "staff"));

        HandleFile.writeToFile(Constains.pathUsers(), users);
    }

    public static void executeProduct() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("p1", "p1-test", "Test 01", 5000));
        products.add(new Product("p2", "p2-test", "Test 02", 50000));
        products.add(new Product("p3", "p3-test", "Test 03", 55000));
        products.add(new Product("p4", "p4-test", "Test 04", 15000));
        products.add(new Product("p5", "p5-test", "Test 05", 45000));

        HandleFile.writeToFile(Constains.pathProducts(), products);
    }
}
