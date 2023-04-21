package de.neuefische;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("A password should be at least 8 characters long and no more than 15. " +
                "\nIt should consist of upper and lower case letters," +
                "\nnumbers and special characters (@,#,§,%,!,?) "  +
                "\nand not be in a trivial one like `123456` or `password`.");
        Scanner scanner = new Scanner(System.in);
                System.out.println("\nEnter your password: ");
        String password = scanner.next();
            isValidatedPass(password);
            scanner.close();
    }
    /**
     * function to check if password is valid
     *
     * @param password
     * @return true
     */
    public static boolean isValidatedPass(String password) {
        boolean isValid = true;
        String numbers = "(.*[0-9].*)";
        String upperChars = "(.*[A-Z].*)";
        String lowerChars = "(.*[a-z].*)";
        String specialChars = "(.*[@,#,§,%,!,?].*$)";
        if (password.length() < 8) {
            System.out.println("Password must be more than 8 characters.");
            isValid = false;
        }
        if (password.length() > 15) {
            System.out.println("Password must be less than 15 characters.");
            isValid = false;
        }
        if (!password.matches(numbers ))
        {
            System.out.println("Password must have at least one number");
            isValid = false;
        }
        if (!password.matches(upperChars ))
        {
            System.out.println("Password must have at least one uppercase character");
            isValid = false;
        }
        if (!password.matches(lowerChars ))
        {
            System.out.println("Password must have at least one lowercase character");
            isValid = false;
        }
        if (!password.matches(specialChars ))
        {
            System.out.println("Password must have at least one special character among @ # $ %");
            isValid = false;
        }
        if (password.equals("passwort") || password.equals("123456")) {
            System.out.println("Password must not be so trivial ;) ");
            isValid = false;
        }
        return isValid;
    }
}