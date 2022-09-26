import java.util.*;
class palin
{  
public static void main(String args[])
{  
int r,sum=0,temp;    
Scanner i = new Scanner (System.in);
System.out.print("enter a number : ");
int a = i.nextInt(); 
temp=a;    
while(a>0)
{    
r=a%10;   
sum=(sum*10)+r;    
a=a/10;    
}    
if(temp==sum)    
System.out.println("palindrome number ");    
else    
System.out.println("not palindrome");    
}  
}



