import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
    	Scanner in = new Scanner(System.in);

        System.out.println("Enter the days::\n");

        int d = in.nextInt();
        int y;
        int w;

        y = (d / 365);
        w = (d % 365) / 7;
        d = d - ((y * 365) + (w));

        System.out.println("\n" + y + " Year, " + w + " Weeks, and " + d + " Days\n");
    }
}