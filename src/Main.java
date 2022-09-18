import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Procedure procedure = new Procedure();
        procedure.printInfoAboutProgram(); // print info about our program

        double firstItem = procedure.initItem(); // initialization first num
        String operation = procedure.initOperation(); // initialization operator (+, - or smth else)
        double secondItem = procedure.initItem(); // initialization second num
        Operation calculator = procedure.getTargetOperation(operation); // get target operation (a+b, a-b, or smth else)

        procedure.doOperation(calculator,firstItem,secondItem); // calculating
        procedure.getOperationResult(calculator); // print result
    }
}
