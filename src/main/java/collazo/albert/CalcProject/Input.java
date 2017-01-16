package collazo.albert.CalcProject;

import java.util.Scanner;

public class Input {

    //All of my variables are now accessible to the entire class.
    static double a;
    static double b;

    //this is how I start the user input(scanner)
    static Scanner in = new Scanner(System.in);

    //this is the method for the first number to be used in the calculator
    public static void firstNum(){
        System.out.println("Enter first number: ");
        a = in.nextDouble();
    }

    //this is the method for the second number in the calculator
    public static void secondNum() {
        System.out.println("Enter second number: ");
        b = in.nextDouble();
    }

    //This is the method for the switch statement operator
   /* public static void operator(){
        System.out.println("Type: ADD, SUBTRACT, MULTIPLY, or DIVIDE");
        s = in.nextLine().toUpperCase();
    }*/
}
