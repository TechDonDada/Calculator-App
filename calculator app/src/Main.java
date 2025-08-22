import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("Welcome to Calculator App");
            System.out.println("Add 1");
            System.out.println("Subtract 2");
            System.out.println("multiply 3");
            System.out.println("divide 4");
            System.out.println("Exit 0");
            int choice = scanner.nextInt();
            if (choice == 0) {
                running = false;
                System.out.println("Goodbye");
                continue;
            }

            int[] numbers = getTwoNumbers(scanner);
            int a = numbers[0];
            int b = numbers[1];

            switch (choice) {
                case 1:
                    System.out.println("result:" + (a + b));
                    break;
                case 2:
                    System.out.println("result:" + (a - b));
                    break;
                case 3:
                    System.out.println("result:" + (a * b));
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("cannot be divided by 0");
                    } else {
                        System.out.println("result" + ((float) a / b));
                        break;
                    }
                default:
                    System.out.println("invalid choice");

            }
        }
        scanner.close();

    }
    public static int[] getTwoNumbers(Scanner scanner){
        System.out.println("Enter Two Numbers");
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        return new int[]{a,b};
    }
}
