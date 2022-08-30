import java.util.Scanner;
public class Year
{
static void Days(m,y,w,d)
{
Scanner s = new Scanner(System.in);
System.out.print("Enter the number of days:");
m = s.nextInt();       
y = m / 365;
m = m % 365;
System.out.print("No. of years:"+y+" ");
w = m / 7;
m = m % 7;
System.out.print("No. of weeks:"+w+" ");
d = m;
System.out.print("No. of days:"+d+" ");
}
}