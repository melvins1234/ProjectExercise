import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProject {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        //primitive
        System.out.println("Hello World");
        byte byteVariable = 127;
        short mediumRangeDecimalVariable = 12345;
        int wholeNumbers = 122;
        long largeDecimalNumbers = -12;
        final float numberWithDecimalPlaces = 8.3f;
        double veryLargeNumberWithDecimalPlace = 12312312.1232;

        //USE MATH OPERATION

                // initializing variables
                int num1 = 10, num2 = 20, sum = 0;

                // Displaying num1 and num2
                System.out.println("num1 = " + num1);
                System.out.println("num2 = " + num2);

                // adding num1 and num2
                sum = num1 + num2;
                System.out.println("The sum = " + sum);

                //COMPOUND ASSIGNMENT OPERATORS

                int number = 5;
                number += 3;
                System.out.println(number);

                number -= 3;
                System.out.println(number);

                number *= 3;
                System.out.println(number);

                number /= 3;
                System.out.println(number);

                number %= 7;
                System.out.println(number);


        //COMPARISON
        //TO CHECK AGAIN

        //INCREMENT AND DECREMENT OPERATIONS

        int numberApples = 5;
        numberApples++;
        System.out.println(numberApples);


        int numberOranges = 5;
        numberOranges--;
        System.out.println(numberOranges);

        int incrementOperatiorA = 5;
        int incrementOperatiorB = 5;

        int incrementOperatiorC = incrementOperatiorA * incrementOperatiorB++;
                System.out.println(incrementOperatiorC);

        int incrementOperatiorD = incrementOperatiorA * --incrementOperatiorB;
                System.out.println(incrementOperatiorD);


        byte b2 = 127;
        b2 %= 7;
        byte b3 = 120;
        b3 &= 40;
        short s1 = 300;
        s1 ^= 100;
        byte b4 = 127;
        b4 >>=3;
        System.out.println(b4);

        //Widening Casting
        //byte -> short -> char -> int -> long -> float -> double

        int myInt = 9;
        double myDouble = myInt;

        System.out.println(myInt);
        System.out.println(myDouble);

        //Narrowing Casting

        double mySecondDouble = 9.78;
        short mySecondShort = (short) mySecondDouble;

        System.out.println(mySecondDouble);
        System.out.println(mySecondShort);

        //Condition if else

        int day = 2;
        if(day == 1) {
            System.out.println("Monday");
        } else if(day == 2) {
            System.out.println("Tuesday");
        } else if(day == 3) {
            System.out.println("Wednesday");
        } else if(day == 4) {
            System.out.println("Thursday");
        } else if(day == 5) {
            System.out.println("Friday");
        } else if(day == 6) {
            System.out.println("Saturday");
        } else if(day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day!");
        }

        //Switch condition

        int dayA = 4;
        switch (dayA) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }


        //int i = 0;
        //while (i < 6)
        //{
         //System.out.println(i);
         //i++;
        //}

        int n = 1;
        while (n<=6)
        {
            System.out.println("["+n+"]");
            n++;
        }

        int sumFirstPositveInt = 0, i = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int inputNumber = scanner.nextInt();
        while (i<=inputNumber)
        {
            sumFirstPositveInt+=i;
            i++;
        }
        System.out.println("Sum of First Positive Integer: "+sumFirstPositveInt);
        generateArray();

    }

    public static void generateArray(){
        System.out.println("Enter Number: ");
        int inputNum = scanner.nextInt();
        int i = 1;
        do {
                System.out.println(i*2);
            i++;
        }while( i <= inputNum);

    }


    //System.out.println();
}
