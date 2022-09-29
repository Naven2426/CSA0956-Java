import java.util.*;
public class day310{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char a;
		int s=0,c=0,flag=0;
		for(int i=1;;i++)
		{
			a=sc.next().charAt(0);
			if(a=='*')
			{
				System.out.print("Value is * so input is terminate\n");
				break;
			}
			else if(a>=65 && a<=90)
			{
				c++;
			}
			else if(a>=97 && a<=122)
			{
				s++;
			}
			else
			{
				flag=1;
				System.out.print("Invalid Input!!!");
				break;
			}	
		}
		
			if(flag==0)
			{
				System.out.print("Caps : "+ c+"\n");
				System.out.print("Small : "+ s);	
			}
			else
			{
				System.out.print("Invalid Input!!!");
			}
			
		
		
		
	}
}