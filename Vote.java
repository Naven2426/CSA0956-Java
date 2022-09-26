import java.util.Scanner;
public class Vote
{
public static void main(String[] args)
{
int age,n;
Scanner sc = new Scanner(System.in);
System.out.print("Enter your age =");
age = sc.nextInt();
if(age>=18)
{
System.out.println("You are eligible for vote.");
}
else
{
n=(18-age);
System.out.println("You can vote After" + n + "years.");
}
}
}