package collazo.albert.CalcProject;

import java.util.Scanner;

public class Display {

    //double defaultDisplay = 0;
    //String defaultOperator;

    /*public void setDisplay(){

        defaultDisplay();
    }*/

    public static void defaultDisplay(){
        Input.a = 0;
        System.out.println(Input.a);
        Input.firstNum();
        getUserInput();

    }

    public static void displayInformation(){

        Input.a = Calculator.answer;
        System.out.println(Calculator.answer);
        //System.out.println("Enter Add, Subtract, Multiply, Divide, or Clear: ");
        getUserInput();

    }

    public static void getUserInput(){

        System.out.println("Enter Add, Subtract, Multiply, Divide, or Clear: ");
        Scanner operator = new Scanner(System.in);
        String input = operator.nextLine().toUpperCase();
        Switch.operatorSwitch(input);

    }

    /*public double firstInput(double a){

        defaultDisplay = a;
        System.out.println(defaultDisplay);

        return defaultDisplay;

    }

    public String secondInput(String s){

        defaultOperator = s;
        System.out.println(defaultOperator);

        return defaultOperator;
    }

    public double thirdInput(double b){

        defaultDisplay = b;
        System.out.println(defaultDisplay);

        return defaultDisplay;
    }*/
}
