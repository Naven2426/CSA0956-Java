import java.util.*;
public class org{
public static void main(String[] args) {
	System.out.println("enter the no of terms  : ");
Scanner sc=new Scanner(System.in);
try
{
int[] arr=new int[100];
int n,sum=0;
System.out.println("enter the no of terms  : ");
n=sc.nextInt();
if(n<100)
{
if(n>0)
{
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(int j=0;j<n;j++)
{
sum+=arr[j];
}
System.out.print(sum);
}
else
{
System.out.print("Invalid Input!!!");
}

}
else
{
throw new ArrayIndexOutOfBoundsException ("Now Error Was throw !!!!!");
}


}
catch(InputMismatchException v)
{
System.out.print("Invalid Input!!!");
}


}
}
