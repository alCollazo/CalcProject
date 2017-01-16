package collazo.albert.CalcProject;

import static collazo.albert.CalcProject.Input.a;
import static collazo.albert.CalcProject.Input.b;

public class Calculator {
    static double answer;

    Display display = new Display();

    Input input = new Input();
    //for testing purposes
    /*double a = 1.5;
    double b = 2.5;*/

    /*public void clearCalc(){

        display.defaultDisplay();

    }*/

    public double addNumbers() {

        input.secondNum();
        return answer = (a + b);


    }

    public double subtractNumbers() {

        input.secondNum();
        return answer = (a - b);

    }

    public double multiplyNumbers() {

        input.secondNum();
        return answer = (a * b);

    }

    public double divideNumbers() {

        input.secondNum();
        return answer = (a / b);
    }


}

