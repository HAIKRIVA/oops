import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Password Strength Checker ===");
        System.out.print("Enter the Password: ");
        String password = sc.nextLine();

        int score = 0;

        // Rule 1: Minimum Length
        if (password.length() >= 8) {
            score++;
        }

        // Rule 2: Contains Uppercase Letter
        if (password.matches(".[A-Z].")) {
            score++;
        }

        // Rule 3: Contains Lowercase Letter
        if (password.matches(".[a-z].")) {
            score++;
        }

        // Rule 4: Contains Number
        if (password.matches(".[0-9].")) {
            score++;
        }

        // Rule 5: Contains Special Character
        if (password.matches(".[@#$%^&+=].")) {
            score++;
        }

        // Result
        System.out.println("\nPassword Analysis Result:");

        if (score <= 2) {
            System.out.println("Password Strength: Weak");
        } 
        else if (score <= 4) {
            System.out.println("Password Strength: Medium");
        } 
        else {
            System.out.println("Password Strength: Strong");
        }

        sc.close();
    }
}