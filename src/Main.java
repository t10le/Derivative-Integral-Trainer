import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        // Correct Answers for Trig Derivatives
        String sin = "cosx";
        String cos = "-sinx";
        String tan = "sec^2x";
        String csc = "-cscxcotx";
        String sec = "secxtanx";
        String cot = "-csc^2x";

        // Correct Answers for Arc Trig Derivatives
        String arcsin = "1/sqrt(1-x^2)";
        String arccos = "-1/sqrt(1-x^2)";
        String arctan = "1/1+x^2";
        String arccsc = "-1/absXsqrt(x^2-1)";
        String arcsec = "1/absXsqrt(x^2-1)";
        String arccot = "-1/1+x^2";

        // Correct Answers for Exponential and Log Functions
        String e = "e^x";
        String a = "a^xln(a)";
        String ln = "1/x";
        String lnfx = "f'x/fx";
        String log = "1/xln(a)";

        // Correct Answers for Anti-Derivative
        String sin2 = "-cosx+c";
        String cos2 = "sinx+c";
        String sec2x = "tanx+c";
        String secxtanx = "secx+c";
        String csc2x = "-cotx+c";
        String cscxcotx = "-cscx+c";
        String xn = "x^n+1/n+1";
        String onedivx = "ln(absX)+C";

        // Array of questions and answers relative by index.
        String[] questions = {"sin", "cos", "tan", "csc", "sec", "cot", "arcsin", "arccos", "arctan", "arccsc", "arcsec", "arccot",
                "e^x", "a^x", "ln(x)", "ln(fx)", "log_a(x)", "Anti sinx", "Anti cosx", "Anti sec^2x", "Anti secxtanx", "Anti csc^2x",
                "Anti cscxcotx", "Anti x^n", "Anti 1/x"};
        String[] answers = {sin, cos, tan, csc, sec, cot, arcsin, arccos, arctan, arccsc, arcsec, arccot, e, a, ln, lnfx, log, sin2,
                cos2, sec2x, secxtanx, csc2x, cscxcotx, xn, onedivx};

        // Variables
        Random rand = new Random();
        int rand_int = rand.nextInt(questions.length - 1);
        int prev_int = 0;
        int count = 1; // Number of questions attempted

        // Intro message.
        System.out.println("Welcome to the Derivative Trainer!");
        System.out.println("Type \"Q\" or \"q\" to quit.");

        Scanner input = new Scanner(System.in);
        System.out.println("\nd/dx of " + questions[rand_int]);
        System.out.print("> ");
        String user = input.next();

        while (!user.equalsIgnoreCase("Q"))
        {
            if (user.equalsIgnoreCase(answers[rand_int])) { System.out.println("Correct!"); }
            else { System.out.println("Incorrect."); }
            // Store the previous question as memory to prevent rolling the question twice in a row.
            prev_int = rand_int;

            // Generate a new question.
            rand_int = rand.nextInt(questions.length);
            // Generate a different question if it rolls on the same question from stored memory.
            while (prev_int == rand_int) {rand_int = rand.nextInt(questions.length - 1);}

            System.out.println("Progress: " + count);
            count++;
            // Display the question and answer format.
            System.out.println("\nd/dx of " + questions[rand_int]);
            System.out.print("> ");
            user = input.next();

        }
        input.close();
        System.out.println("Program Finished!");
    }
}
