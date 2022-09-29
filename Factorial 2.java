import java.util.*;
class Factorial
{
	public static int fac(int n){
		
		if(n==0)
		{
			return 1;
		}
		else{
			return(n*fac(n-1));
		}
	}
	public static void main(String args[]){
		Scanner lol=new Scanner(System.in);
		try{
			System.out.println("Enter a number :");
			int n=lol.nextInt();
			if(n>=0){
				int fact=fac(n);
				System.out.println("Factorial of Given Number is :"+fact);
			}
			else{
				System.out.println("Invalid  Input....");
			}
		}
		catch(InputMismatchException e){
			System.out.println("Invalid Input....");
		}
	}
}