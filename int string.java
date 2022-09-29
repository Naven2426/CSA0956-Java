import java.util.*;
class String{
	public static void main(String args[]){
		Scanner lol=new Scanner(System.in);
		try{
			System.out.println("Enter an integer :");
			int n=lol.nextInt();
			if(n>0){
				System.out.print("[");
				for(int i=1;i<=n;i++){
					if(i%3==0 && i%5==0){
						System.out.print("FizzBuzz,");
					}
					else if(i%3==0){
						System.out.print("Fizz,");
					}
					else if(i%5==0){
						System.out.print("Buzz,");
					}
					else{
						System.out.print(i+",");
					}
				}
			System.out.print("]");
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