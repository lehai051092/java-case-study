package action.product;

import common.Constains;
import io.HandleFile;
import model.Product;

import java.util.List;
import java.util.Scanner;

public class Remove {
    public static void execute(List<Product> products) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input SKU: ");
        String sku = scanner.nextLine();

        if (Common.checkSku(sku).equals("")) {
            handleRemove(sku, products);
        } else {
            System.out.println("Product not exist. Please try again!!!");
        }
    }

    private static void handleRemove(String sku, List<Product> products) {
        for (Product product : products) {
            if (product.getSku().equals(sku)) {
                products.remove(product);
                break;
            }
        }

        HandleFile.writeToFile(Constains.pathProducts(), products);
        System.out.println("Remove Product " + sku + " Successfully!!!");
    }
}
