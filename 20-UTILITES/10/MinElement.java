
import java.util.Scanner;

public class MinElement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int minValue = Integer.MAX_VALUE;
        System.out.println("\nEnter integer value one at a time.");
        System.out.println("Enter \"exit\" of \"quit\" to exit.\n");
        
        while (true) {

            String nextLine = scanner.nextLine();

            if (nextLine.equals("exit") || nextLine.equals("quit")) {
                break;
            }
            
            if (nextLine.equals("min?")) {
                System.out.println("\nMin value is: " + minValue + "\n");
                continue;
            }

            try {
                int nextInt = Integer.parseInt(nextLine);
                minValue = nextInt < minValue ? nextInt : minValue;
            } catch (Exception e) {
                System.out.println(nextLine + " is not a valid integer value! Try again.");
            }
        }

        System.out.println("\nMin value is: " + minValue);

        scanner.close();
    }
}

