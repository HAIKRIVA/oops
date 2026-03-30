import java.util.Scanner;

/**
 * PasswordChecker - A professional password strength analyzer
 * 
 * This application evaluates password strength based on multiple criteria:
 * - Minimum length of 8 characters
 * - Presence of uppercase letters (A-Z)
 * - Presence of lowercase letters (a-z)
 * - Presence of numbers (0-9)
 * - Presence of special characters (@#$%^&+=)
 * 
 * Strength Levels:
 * - WEAK: 0-2 criteria met
 * - MEDIUM: 3-4 criteria met
 * - STRONG: All 5 criteria met
 */
public class PasswordChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=====================================");
        System.out.println("   PASSWORD STRENGTH ANALYZER v1.0   ");
        System.out.println("=====================================");
        System.out.print("\nEnter password to analyze: ");
        String password = sc.nextLine();
        
        PasswordAnalysis analysis = analyzePassword(password);
        displayResults(analysis);
        
        sc.close();
    }
    
    /**
     * Analyzes password strength based on predefined criteria
     */
    private static PasswordAnalysis analyzePassword(String password) {
        PasswordAnalysis analysis = new PasswordAnalysis();
        
        // Check length
        if (password.length() >= 8) {
            analysis.score++;
            analysis.feedback.append("[PASS] Minimum 8 characters requirement met\n");
        } else {
            analysis.feedback.append("[FAIL] Password must be at least 8 characters long\n");
        }
        
        // Check uppercase
        if (password.matches(".*[A-Z].*")) {
            analysis.score++;
            analysis.feedback.append("[PASS] Contains uppercase letters (A-Z)\n");
        } else {
            analysis.feedback.append("[FAIL] Must contain at least one uppercase letter\n");
        }
        
        // Check lowercase
        if (password.matches(".*[a-z].*")) {
            analysis.score++;
            analysis.feedback.append("[PASS] Contains lowercase letters (a-z)\n");
        } else {
            analysis.feedback.append("[FAIL] Must contain at least one lowercase letter\n");
        }
        
        // Check digits
        if (password.matches(".*[0-9].*")) {
            analysis.score++;
            analysis.feedback.append("[PASS] Contains numeric digits (0-9)\n");
        } else {
            analysis.feedback.append("[FAIL] Must contain at least one numeric digit\n");
        }
        
        // Check special characters
        if (password.matches(".*[@#$%^&+=].*")) {
            analysis.score++;
            analysis.feedback.append("[PASS] Contains special characters (@#$%^&+=)\n");
        } else {
            analysis.feedback.append("[FAIL] Must contain special character (@#$%^&+=)\n");
        }
        
        return analysis;
    }
    
    /**
     * Displays the password analysis results
     */
    private static void displayResults(PasswordAnalysis analysis) {
        System.out.println("\n=====================================");
        System.out.println("          ANALYSIS RESULTS           ");
        System.out.println("=====================================\n");
        System.out.print(analysis.feedback.toString());
        
        System.out.println("\nCriteria Met: " + analysis.score + " / 5");
        System.out.println("-------------------------------------");
        
        String strength;
        String recommendation;
        
        if (analysis.score <= 2) {
            strength = "WEAK";
            recommendation = "Please add more character types (uppercase, lowercase, numbers, special chars)";
        } else if (analysis.score <= 4) {
            strength = "MEDIUM";
            recommendation = "Good, but add missing character types for better security";
        } else {
            strength = "STRONG";
            recommendation = "Excellent! Your password meets all security criteria";
        }
        
        System.out.println("Password Strength: " + strength);
        System.out.println("Recommendation: " + recommendation);
        System.out.println("=====================================\n");
    }
    
    /**
     * Inner class to store password analysis data
     */
    private static class PasswordAnalysis {
        int score = 0;
        StringBuilder feedback = new StringBuilder();
    }
}