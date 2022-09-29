import java.util.*;

class Perfect{
	public static void main(String args[]){
		Scanner lol=new Scanner(System.in);
		try{
			System.out.println("Enter a number :");
			int n=lol.nextInt(),c=0;
			if(n>0){
			for(int i=1;i<n;i++){
				if(n%i==0){9:01 AM 29-Sep-22
					c=c+i;
				}
			}
			if(c==n){
				System.out.println("It's a Perfect Number ....");
			}
			else
				System.out.println("Not a Perfect Number ....");
			}
			else{
				System.out.println("Invalid Input...");
			}
		}
		catch(InputMismatchException e){
			System.out.println("Invalid Input....");
		}
	}
}