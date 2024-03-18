import java.util.Scanner;
  public class DigitSeparation {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter an integer: ");
            int number = scanner.nextInt();
            if (number >= 0 && number <= 99999) {
                System.out.println("Digits:");
                String numberString = Integer.toString(number);
                for (int i = 0; i < numberString.length(); i++) {
                    System.out.print(numberString.charAt(i) + " ");
                }
                System.out.println();
            } else {
                System.out.println("Invalid input");
            }

            scanner.close();
        }
    }


