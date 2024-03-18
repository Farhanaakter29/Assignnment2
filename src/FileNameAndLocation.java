import java.util.Scanner;
public class FileNameAndLocation {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the drive letter (e.g., C): ");
            String driveLetter = scanner.nextLine();
            System.out.print("Enter the path (e.g., \\Windows\\System): ");
            String path = scanner.nextLine();
            System.out.print("Enter the file name (e.g., Readme): ");
            String fileName = scanner.nextLine();
            System.out.print("Enter the extension (e.g., txt): ");
            String extension = scanner.nextLine();
            String fileSeparator = System.getProperty("file.separator");
            String completeFileName;
            if (System.getProperty("os.name").startsWith("Windows")) {
                completeFileName = driveLetter + ":" + fileSeparator + path + fileSeparator + fileName + "." + extension;
            } else {
                completeFileName = path + fileSeparator + fileName + "." + extension;
            }
            System.out.println("Complete file name: " + completeFileName);
            scanner.close();
        }

}
