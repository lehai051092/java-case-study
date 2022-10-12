import action.AddMockData;
import action.CheckFile;
import action.CheckLogin;
import common.Constains;
import io.HandleFile;
import model.Product;
import model.User;
import view.MenuProduct;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (CheckFile.isExist(Constains.pathUsers()) || CheckFile.isExist(Constains.pathProducts())) {
            return;
        }

        List<User> users = HandleFile.readDataFromFile(Constains.pathUsers());
        if (users.isEmpty()) {
            AddMockData.executeUser();
            AddMockData.executeProduct();
        }

        User user = CheckLogin.execute(users);
        if (user != null) {
            List<Product> products = HandleFile.readDataFromFile(Constains.pathProducts());
            MenuProduct.show(user, products);
        }
    }
}
