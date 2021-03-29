public class MainProject {

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

    }


    //System.out.println();
}
