package collazo.albert.CalcProject;

public class Switch {

    static Calculator calculator = new Calculator();


    public static void operatorSwitch(String choice){

        switch(choice){
            case "CLEAR":

                Display.defaultDisplay();
                break;

            case "ADD":

                calculator.addNumbers();
                Display.displayInformation();
                break;

            case "SUBTRACT":

                calculator.subtractNumbers();
                Display.displayInformation();
                break;

            case "MULTIPLY":

                calculator.multiplyNumbers();
                Display.displayInformation();
                break;

            case "DIVIDE":

                calculator.divideNumbers();
                Display.displayInformation();
                break;

            default: System.out.println("Invalid input. Try again!: ");
                Display.displayInformation();
                System.out.println(Input.a);
        }

    }
}
