import java.util.Scanner;

public class DecisionMaker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== The Smart Decision Matrix ===");
        System.out.println("Stuck between two choices? Let math decide.\n");
        
        System.out.print("Enter your First Option (e.g., Remote Job): ");
        String opt1 = sc.nextLine();
        System.out.print("Enter your Second Option (e.g., Office Job): ");
        String opt2 = sc.nextLine();

        System.out.println("\nWe will score both options across 3 important criteria.");
        System.out.println("Rate each option from 1 (Terrible) to 10 (Amazing).");
        
        String[] criteria = {"Finances / Cost", "Effort / Work-Life Balance", "Future Growth / Happiness"};
        int score1 = 0;
        int score2 = 0;

        for (String c : criteria) {
            System.out.println("\n--- Category: " + c + " ---");
            while (true) {
                try {
                    System.out.print("Rate [" + opt1 + "] (1-10): ");
                    int s1 = Integer.parseInt(sc.nextLine());
                    System.out.print("Rate [" + opt2 + "] (1-10): ");
                    int s2 = Integer.parseInt(sc.nextLine());
                    
                    if (s1 < 1 || s1 > 10 || s2 < 1 || s2 > 10) {
                        System.out.println("Error: Please stick to a 1 to 10 scale.");
                        continue;
                    }
                    
                    score1 += s1;
                    score2 += s2;
                    break;
                } catch(NumberFormatException e) {
                    System.out.println("Error: Invalid number. Let's try rating this category again.");
                }
            }
        }

        System.out.println("\n==================================");
        System.out.println("           FINAL RESULTS          ");
        System.out.println("==================================");
        System.out.println("Option 1 [" + opt1 + "] Total Score: " + score1);
        System.out.println("Option 2 [" + opt2 + "] Total Score: " + score2);
        System.out.println("----------------------------------");

        if (score1 > score2) {
            System.out.println("*** WINNER: You should go with -> " + opt1 + " ***");
        } else if (score2 > score1) {
            System.out.println("*** WINNER: You should go with -> " + opt2 + " ***");
        } else {
            System.out.println("=== IT'S A TIE! Both choices are equally good. Trust your gut! ===");
        }
        sc.close();
    }
}
