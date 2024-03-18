
import java.util.Scanner;
public class TransformformNumberToMonthName {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String months = "January February March April May June July August September October November December";
            System.out.print("Enter a number between 1 and 12: ");
            int number = scanner.nextInt();
            if (number >= 1 && number <= 12) {
                int startIndex = (number - 1) * 9;
                String monthName = months.substring(startIndex, startIndex + 9).trim();
                System.out.println("Month name: " + monthName);
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 12.");
            }
            scanner.close();
        }
    }

