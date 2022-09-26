import java.util.*;
public class User
{
public static void main(String args[])
{
String username1,username2;
Scanner s = new Scanner(System.in);
System.out.print("Enter username1:");
username1 = s.next();
System.out.print("Enter username2:");
username2 = s.next();
if(username1.equals(username2))
{
System.out.print("User name is Valid");
}
else
{
System.out.print("User name is InValid");
}
}
}

