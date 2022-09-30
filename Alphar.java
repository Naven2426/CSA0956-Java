import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
 class Alphar
{
public static void main(String[] args)
{
System.out.print("Enter string to reverse:");
Scanner read = new Scanner(System.in);
String str = read.nextLine();
char c[] = str.toCharArray();
Arrays.sort(c);
String std=new String(c);
String reverse = "";
for(int n = std.length() - 1; n>= 0; n--)
{
reverse = reverse +std.charAt(i);
}
System.out.print("Reversed string is:");
System.out.print(reverse);
}
}