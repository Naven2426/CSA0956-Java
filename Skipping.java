import java.util.*;
import java.lang.*;
public class skip{
public static void main(String args[]){
Scanner obj=new Scanner(System.in);
System.out.println("enter the M : ");
int m=obj.nextInt();
System.out.println("enter the N : ");
int n=obj.nextInt();
System.out.println("enter the K : ");
int k=obj.nextInt();
if(m>n || m<0 || n<0 || k<0 || m==n)
System.out.print("invalid.....");
else{
for(int i=m;i<=n;i+=(k+1))
System.out.println(i);
}

}
}