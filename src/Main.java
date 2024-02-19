import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("**** Welcome to the calculator ***" + "\n");
        System.out.println("Please choose the operation you want perform !!!" + "\n");
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter two numbers to add:");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                System.out.println("Result: " + add(num1, num2));
                break;
            case 2:
                System.out.println("Enter two numbers to subtract:");
                int num3 = input.nextInt();
                int num4 = input.nextInt();
                System.out.println("Result: " + subtract(num3, num4));
                break;
            case 3:
                System.out.println("Enter two numbers to multiply:");
                int num5 = input.nextInt();
                int num6 = input.nextInt();
                System.out.println("Result: " + multiply(num5, num6));
                break;
            case 4:
                System.out.println("Enter two numbers to Divide:");
                int num7 = input.nextInt();
                int num8 = input.nextInt();
                System.out.println("Result: " + divide(num7, num8));
                break;
        }
        input.close();
    }
    private static int divide(int a, int b)
    {
        return a/b;
    }
    public static int add(int a, int b)
    {
        return a + b;
    }
    public static int subtract(int a, int b)
    {
        return a - b;
    }
    public static int multiply(int a, int b)
    {
        return a * b;
    }

        }



