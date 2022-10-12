package action.product;

import model.Product;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SortPrice {
    public static void execute(List<Product> products) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. A > B");
        System.out.println("2. B > A");
        System.out.println("3. Exit");

        System.out.println("Enter type sort price: ");
        int typeSort = scanner.nextInt();

        if (typeSort == 1 || typeSort == 2) {
            switch (typeSort) {
                case 1:
                    typeAB(products);
                    break;
                case 2:
                    typeBA(products);
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("Exit Sort!!!");
        }
    }

    private static void typeAB(List<Product> products)
    {
        products.sort(Comparator.comparing(Product::getPrice));
        System.out.println(products);
    }

    private static void typeBA(List<Product> products)
    {
        products.sort(Comparator.comparing(Product::getPrice).reversed());
        System.out.println(products);
    }
}
