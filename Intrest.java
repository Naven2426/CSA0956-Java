import java.util.Scanner;
class interst
{
    public static void main(String[] args) 
    {
        float p, r, t, si;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = scan.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        r = scan.nextFloat();
        System.out.print("Enter the Time period : ");
        t = scan.nextFloat();
        si = (p * r * t) / 100;
        System.out.print("Simple Interest is: " +si);
    }
}
