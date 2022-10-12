package action.product;

import common.Constains;
import io.HandleFile;
import model.Product;

import java.util.List;
import java.util.Scanner;

public class Edit {
    public static void execute(List<Product> products) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input SKU: ");
        String sku = scanner.nextLine();

        if (Common.checkSku(sku).equals("")) {
            handleEdit(sku, scanner, products);
        } else {
            System.out.println("Product not exist. Please try again!!!");
        }
    }

    private static void handleEdit(String sku, Scanner scanner, List<Product> products) {
        System.out.println("Input name: ");
        String name = scanner.nextLine();

        System.out.println("Input brand: ");
        String brand = scanner.nextLine();

        System.out.println("Input price: ");
        String price = scanner.nextLine();

        for (Product product : products) {
            if (product.getSku().equals(sku)) {
                if (!name.isEmpty()) {
                    product.setName(name);
                }

                if (!brand.isEmpty()) {
                    product.setBrand(brand);
                }

                if (!price.isEmpty()) {
                    product.setPrice(Integer.parseInt(price));
                }

                break;
            }
        }

        HandleFile.writeToFile(Constains.pathProducts(), products);
        System.out.println("Edit Product " + sku + " Successfully!!!");
    }
}
