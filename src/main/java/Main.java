
import controlller.Bank;
import entity.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your gender:");
        String gender = scanner.nextLine();
        User user = new User("3333333", name, 0.00, gender);
        if (gender.trim().equalsIgnoreCase("male")) {
            gender = "Mr. ";
            System.out.println("Welcome to Bank ,Mr.  " + user.name);
        } else if (gender.trim().equalsIgnoreCase("female")) {
            System.out.println("Welcome to Bank ,Mrs. " + user.name);
            gender = "Mrs. ";
        }
        Bank bank = new Bank();
        bank.setActiveUser(user);
do {
    System.out.printf(gender + name+",\n Please choose the option:\n1.Credit\n2.Debit\n3.Balance\n");
    String choice = scanner.nextLine().trim();
    if (choice.equalsIgnoreCase("balance")) {
        System.out.println("Current balance is:  " + bank.getUserBalance());

    } else if (choice.equalsIgnoreCase("credit")) {
        System.out.println(gender + name + ", enter the value,please:");
        String response = bank.creditUser(scanner.nextFloat());

    } else if (choice.equalsIgnoreCase("debit")) {
        System.out.println(gender + name + ", enter the value,please:");
        String response = bank.debitUser(scanner.nextFloat());

    }
    System.out.println("do you want to continue?");
} while (scanner.next().equalsIgnoreCase("yes"));

        System.out.println("good bye");
    }
}
