import java.util.Arrays;  
import java.util.Scanner;
import java.util.*;  
public class Ascending  
{  
public static void main(String args[])   
{  
Scanner a=new Scanner(System.in);
Scanner a1=new Scanner(System.in);
int n;  
System.out.println("Enter the number of elements ");
n=a.nextInt();
String str[]=new String[n];   
System.out.println("Enter the String ");
for(int i=0; i<n ;i++)     
{
str[i]=a1.nextLine();
}
Scanner a2=new Scanner(System.in);
System.out.print("Order (A/D): ");
String sta=a2.nextLine();
if(sta.equals("A"))
{
Arrays.sort(str);   
System.out.println(Arrays.toString(str)); 
}
else
{
Arrays.sort(str,Collections.reverseOrder());   
System.out.println(Arrays.toString(str)); 
}  
}  
}