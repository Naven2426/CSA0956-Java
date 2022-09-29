import java.util.*;
public class day311{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s,e;
		s=sc.nextInt();
		e=sc.nextInt();
		if(s>0 && e>0 && s!=e && e>s)
		{
			System.out.print("[");
			for(int i=s;i<=e;i++)
			{ 
				int c=i*i;
				
				System.out.print("("+i+",");
				System.out.print(c+")"+",");
			}
			System.out.print("]");
		}
		else
		{
			System.out.print("Invalid Input!!!");
		}
		
	}
}