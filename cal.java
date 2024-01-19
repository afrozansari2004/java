import java.util.*;

public class cal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        int a = sc.nextInt();
        System.out.println("Enter your second number");
        int b = sc.nextInt();

        System.out.println("type 1 for add");
        System.out.println("type 2 for subtratct");
        System.out.println("type 3 for multiply");
        System.out.println("type 4 for divide");
        System.out.println("type 5 for remainder");

        int button = sc.nextInt();

        switch (button) {
            case 1:
                int sum = a + b;
                System.out.println(sum);
                break;

            case 2:
                int diff = a - b;
                System.out.println(diff);
                break;

            case 3:
                int multiply = a * b;
                System.out.println(multiply);
                break;

            case 4:
                int divide = a / b;
                System.out.println(divide);
                break;

            case 5:
                int rem = a % b;
                System.out.println(rem);

            default:
                System.out.println("not valid key");
        }
    }
}
