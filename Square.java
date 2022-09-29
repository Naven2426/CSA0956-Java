import java.util.*;
class Square
{
	public static void main(String args[]){
		Scanner lol=new Scanner(System.in);
		try{
			System.out.println("Enter a nuumber :");
			float n=lol.nextFloat();
			float sq=n*n;
			float qu=n*n*n;
			System.out.println("Square :"+sq);
			System.out.println("Qube :"+qu);
		}
		catch(InputMismatchException e){
			System.out.println("Invalid Input....");
		}
	}
}