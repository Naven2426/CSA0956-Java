import java.util.*;
class Convert
{
void convert()
{
Scanner scan;
int num;

scan = new Scanner(System.in);
System.out.println("Enter the number :");
num = Integer.parseInt(scan.next());
String octal = Integer.toOctalString(num);
System.out.println("Octal Value is : " + octal);
String binary = Integer.toBinaryString(num);
System.out.println("Binary Value is : " + binary);
}
}
class decimal
{
public static void main(String args[])
{
Convert obj = new Convert();
obj.convert();
}
}
