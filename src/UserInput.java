import java.util.Scanner;

public class UserInput {
    public static Scanner input = new Scanner(System.in);

    public static void read() {
        while (true) {
            System.out.println("Enter a positive integer for a Floyd triangle or anything else to exit");

            try {
                int num = Integer.parseInt(input.nextLine());

                if (num <= 0) {
                    System.out.println("The number must be a positive integer.");
                    continue;
                }

                FloydTriangle triangle = new FloydTriangle(num);
                triangle.toConsole();
                FileHandler.writeToFile(triangle.toString(), "Floyd.txt");
            } catch (Exception e) {
                break;
            }
        }

    }
}
