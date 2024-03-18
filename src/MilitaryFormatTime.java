
import java.util.Scanner;

    public class MilitaryFormatTime{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter the first time (HHMM): ");
            int time1 = scanner.nextInt();
            System.out.print("Please enter the second time (HHMM): ");
            int time2 = scanner.nextInt();
            int hours1 = time1 / 100;
            int minutes1 = time1 % 100;
            int hours2 = time2 / 100;
            int minutes2 = time2 % 100;
            int hourDifference = hours2 - hours1;
            int minuteDifference = minutes2 - minutes1;
            if (hourDifference < 0) {
                hourDifference += 24;
            }
            int totalMinutesDifference = hourDifference * 60 + minuteDifference;
            int hours = totalMinutesDifference / 60;
            int minutes = totalMinutesDifference % 60;
            System.out.println("Time difference: " + hours + " hours " + minutes + " minutes");
            scanner.close();
        }
    }

