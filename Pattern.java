import java.util.*;
class Star  
{   
public static void main(String [] args)   
{     
int i, j;
Scanner m = new Scanner (System.in);
System.out.print("Enter a number : ");
int n = m.nextInt();
for(i=0; i<n; i++)   
{ 
for(j=0; j<=i; j++)   
{      
System.out.print("* ");   
}   
System.out.println();   
}   
}   
}