import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Password Strength Checker ===");
        System.out.print("Enter the Password: ");
        String password = sc.nextLine();

        int score = 0;

        if (password.length() >= 8) {
            score++;
        }
        if (password.matches(".*[A-Z].*")) {
            score++;
        }
        if (password.matches(".*[a-z].*")) {
            score++;
        }
        if (password.matches(".*[0-9].*")) {
            score++;
        }
        if (password.matches(".*[@#$%^&+=].*")) {
            score++;
        }
        System.out.println("\nPassword Analysis Result:");

        if (score <= 2) {
            System.out.println("Password Strength: Weak");
        } 
        else if (score <= 4) {
            System.out.println("Password Strength: Medium");
        } 
        else {
            System.out.println("Password Strength: Strong");
            System.out.println("Congratulations! Your password is strong.");

        }

        sc.close();
    }
}
