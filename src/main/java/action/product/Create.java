package action.product;

import common.Constains;
import io.HandleFile;
import model.Product;
import java.util.List;
import java.util.Scanner;

public class Create {
    public static void execute(List<Product> products) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input SKU: ");
        String sku = scanner.nextLine();
        sku = Common.checkSku(sku);

        if (!sku.equals("")) {
            System.out.println("You can use this SKU!!!");
            System.out.println("Input Name: ");
            String name = scanner.nextLine();

            System.out.println("Input Brand: ");
            String brand = scanner.nextLine();

            System.out.println("Input Price: ");
            int price = scanner.nextInt();

            products.add(new Product(sku, name, brand, price));
            HandleFile.writeToFile(Constains.pathProducts(), products);
            System.out.println("Save Product " + sku + " Successfully!!!");
        } else {
            System.out.println("SKU is exist. Please try again!!!");
        }
    }
}
