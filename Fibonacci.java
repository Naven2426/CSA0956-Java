import java.util.*;

class Fibonacci
{
	public static void main(String args[]){
		Scanner lol=new Scanner(System.in);
		try{
			System.out.println("Enter a number :");
			int n=lol.nextInt();
			if(n>0){
				int a=0,b=1,temp=0;
				System.out.print(a+"\t"+b+"\t");
				for(int i=0;i<n;i++){
					temp=a+b;
					System.out.print(temp+"\t");
					a=b;
					b=temp;
				}
			}
			else if(n<0){
				int a1=0,b1=-1,temp1=0;
				System.out.print(a1+"\t"+b1+"\t");
				for(int i=0;i>n;i--){
					temp1=a1+b1;
					System.out.print(temp1+"\t");
					a1=b1;
					b1=temp1;
				}
			}
			else{
				System.out.println("Invalid Input....");
			}
		}
		catch(InputMismatchException e){
			System.out.println("Invalid Input....");
		}
	}
}