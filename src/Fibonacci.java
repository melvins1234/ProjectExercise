import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();
        int num = 0, num1 = 1;

        for(int i = 0; i < number; i++){
            int sum = num + num1;
            num = num1;
            num1 = sum;
            System.out.print(num + ", ");
        }
        // 1 , 1, 2, 3, 5
    }
}
