import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Procedure {
    private static final String VERSION = "1.0";

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m";
    Scanner in = new Scanner(System.in);

    public void printInfoAboutProgram()
    {
        System.out.println(PURPLE_BOLD_BRIGHT + "Simple Calculator Version " + VERSION+"\n" + ANSI_RESET);
        System.out.println(ANSI_WHITE + "-Team Lead:\t\t\t\t -Testers:\t\t\t\t -Coder:\t\t");
        System.out.println(RED_BOLD + "Hrybich I.  \tKozyberdin D. Lyashkova O.\t\tPasichnyk O." + ANSI_RESET + "\n");
    }

    public double initItem()
    {
        return in.nextDouble();
    }

    public String initOperation()
    {
        return in.next();
    }

    public Operation getTargetOperation(String op)
    {
        Operation calc;

        if (op.equals("+"))
            calc = new Addition(0,0);
        else if (op.equals("-"))
            calc = new Subtraction(0,0);
        else if (op.equals("*"))
            calc = new Multiplication(0, 0);
        else if (op.equals("/"))
            calc = new Division(0,0);
        else calc = new UnknownOperation();

        System.out.print(YELLOW_BOLD);
        calc.getOperationName();
        System.out.print(ANSI_RESET);
        return calc;
    }

    public void doOperation(Operation calc, double a, double b)
    {
        calc.setFirstItem(a);
        calc.setSecondItem(b);
        calc.doOperate();
    }

    public void getOperationResult(Operation calc)
    {
        System.out.print(GREEN_BOLD_BRIGHT);
        calc.getResult();
        System.out.print(ANSI_RESET);
    }
}
