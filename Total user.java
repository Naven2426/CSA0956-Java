import java.util.*;
class User
{
public static void main(String [] args)
{
int i,j,k;
Scanner o = new Scanner (System.in);
System.out.print("Total User : ");
i= o.nextInt();
Scanner m = new Scanner (System.in);
System.out.print("Staff User : ");
 j = m.nextInt();
k=j/3;
int a = j+k;
int b = i-a;
System.out.print("Student User : "+b);
}
}