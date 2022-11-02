import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // CODE SEGMENT A
        int p = 5;
        int q = 0;

        if (p > 0 || (p / q) == 2)
        {
            System.out.println("it’s true :)");
        }
        else
        {
            System.out.println("it’s false :(");
        }

        // CODE SEGMENT B
         p = 5;
         q = 0;

        if ((p < 3 && (p / q) == 2))
        {
            System.out.println("it’s true :)");
        }
        else
        {
            System.out.println("it’s false :(");
        }

        // CODE SEGMENT C
         p = 5;
         q = 0;

        if (p < 3 || (p / q) == 2)
        {
            System.out.println("it’s true :)");
        }
        else
        {
            System.out.println("it’s false :(");
        }

        // CODE SEGMENT D
 p = 5;
        q = 0;

        if (p > 0 && (p / q) == 2)
        {
            System.out.println("it’s true :)");
        }
        else
        {
            System.out.println("it’s false :(");
        }

    }
}
