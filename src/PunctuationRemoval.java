import java.util.Scanner;

public class PunctuationRemoval{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please any number wiyh comma: ");
        String inputNumber = scanner.next();
        int len=inputNumber.length();
        String firstSome=inputNumber.substring(0,len-4);
        String lastThree=inputNumber.substring(len-3);
        System.out.println( firstSome+ lastThree);
        scanner.close();
    }
}
