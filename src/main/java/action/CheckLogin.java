package action;

import io.HandleFile;
import model.User;

import java.util.List;
import java.util.Scanner;

public class CheckLogin {
    public static User execute(List<User> users)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Login!!!");
        System.out.println("Enter email: ");
        String email = scanner.nextLine();

        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        for (User user : users) {
            if (email.equals(user.getEmail()) && password.equals(user.getPassword())) {
                System.out.println("Welcome to login " + user.getName() + "!!!");
                return user;
            }
        }

        System.out.println("Something went wrong!!!");
        return null;
    }
}
