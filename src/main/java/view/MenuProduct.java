package view;

import action.product.*;
import common.Constains;
import model.Product;
import model.User;

import java.util.Scanner;

public class MenuProduct {
    public static void show(User user, java.util.List<Product> products) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("=====Product Management=====");
            System.out.println("*******************************");
            showMenuWithRole(user);

            System.out.println("Please input choose:");
            int choice = scanner.nextInt();
            flag = functionsWithRole(choice, user, products, flag);
        }
    }

    private static void showMenuWithRole(User user) {
        if (user.getRole().equals("admin")) {
            System.out.println("1. List Product");
            System.out.println("2. Insert Product");
            System.out.println("3. Edit Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Search Product");
            System.out.println("6. Sort Product by price");
            System.out.println("7. Exit");
        } else {
            System.out.println("1. List Product");
            System.out.println("2. Search Product");
            System.out.println("3. Sort Product by price");
            System.out.println("4. Exit");
        }
    }

    private static boolean functionsWithRole(int choice, User user, java.util.List<Product> products, boolean flag) {
        if (user.getRole().equals("admin")) {
            switch (choice) {
                case 1:
                    List.show(Constains.pathProducts());
                    break;
                case 2:
                    Create.execute(products);
                    break;
                case 3:
                    Edit.execute(products);
                    break;
                case 4:
                    Remove.execute(products);
                    break;
                case 5:
                    Search.execute(products);
                    break;
                case 6:
                    SortPrice.execute(products);
                    break;
                case 7:
                    System.out.println("Exit Program!!!");
                    flag = false;
                    break;
                default:
                    System.out.println("Your selection does not exist. Please try again!!!");
                    break;
            }
        } else {
            switch (choice) {
                case 1:
                    List.show(Constains.pathProducts());
                    break;
                case 2:
                    Search.execute(products);
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Exit Program!!!");
                    flag = false;
                    break;
                default:
                    System.out.println("Your selection does not exist. Please try again!!!");
                    break;
            }
        }

        return flag;
    }
}
