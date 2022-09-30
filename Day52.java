import java.util.*;
class thread extends Thread
{
public void run()
{
try
{
Scanner y=new Scanner(System.in);
int a=0;
int b=1;
int n=y.nextInt();
int c=a+b;
System.out.println(a);
System.out.println(b);
for(int m=0;m<n-2;m++)
{
System.out.println(c);
a=b;b=c;c=a+b;
}
}catch (Exception e)
{
System.out.println(e.toString());
}
}
}
class Main{
public static void main(String[] args){
thread ob=new thread();
ob.start();
}
}