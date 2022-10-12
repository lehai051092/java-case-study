package action.product;

import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Search {
    public static void execute(List<Product> products) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. SKU");
        System.out.println("2. NAME");
        System.out.println("3. BRAND");
        System.out.println("4. PRICE");
        System.out.println("5. ALL");
        System.out.println("6. Exit");

        System.out.println("Enter type keyword search: ");
        int typeKeyword = scanner.nextInt();

        if (typeKeyword == 1 || typeKeyword == 2 || typeKeyword == 3 || typeKeyword == 4 || typeKeyword == 5) {
            switch (typeKeyword) {
                case 1:
                    typeSku(products);
                    break;
                case 2:
                    typeName(products);
                    break;
                case 3:
                    typeBrand(products);
                    break;
                case 4:
                    typePrice(products);
                    break;
                case 5:
                    typeAll(products);
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("Exit Search!!!");
        }
    }

    private static void typeSku(List<Product> products) {
        String keyword = getKeyword();
        List<Product> newProducts = new ArrayList<>();

        for (Product product : products) {
            if (product.getSku().contains(keyword)) {
                newProducts.add(product);
            }
        }

        System.out.println(newProducts);
    }

    private static void typeName(List<Product> products) {
        String keyword = getKeyword();
        List<Product> newProducts = new ArrayList<>();

        for (Product product : products) {
            if (product.getName().contains(keyword)) {
                newProducts.add(product);
            }
        }

        System.out.println(newProducts);
    }

    private static void typeBrand(List<Product> products) {
        String keyword = getKeyword();
        List<Product> newProducts = new ArrayList<>();

        for (Product product : products) {
            if (product.getBrand().contains(keyword)) {
                newProducts.add(product);
            }
        }

        System.out.println(newProducts);
    }

    private static void typePrice(List<Product> products) {
        String keyword = getKeyword();
        List<Product> newProducts = new ArrayList<>();

        for (Product product : products) {
            if (String.valueOf(product.getPrice()).contains(keyword)) {
                newProducts.add(product);
            }
        }

        System.out.println(newProducts);
    }

    private static void typeAll(List<Product> products) {
        String keyword = getKeyword();
        List<Product> newProducts = new ArrayList<>();

        for (Product product : products) {
            if (product.getSku().contains(keyword) || product.getName().contains(keyword) || product.getBrand().contains(keyword) || String.valueOf(product.getPrice()).contains(keyword)) {
                newProducts.add(product);
            }
        }

        System.out.println(newProducts);
    }

    private static String getKeyword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter keyword search: ");
        return scanner.nextLine();
    }
}
