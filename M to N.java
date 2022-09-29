import java.util.*;

public class day38{
	public static void main(String args[]){
		Scanner lol=new Scanner(System.in);
		try{
			System.out.println("Enter the M value :");
			int m=lol.nextInt();
			System.out.println("Enter the N value :");
			int n=lol.nextInt();
			if(m>0 && n>0){
				for(int i=1;i<=n;i++){
					System.out.println(i+"X"+m+"="+m*i);
				}
			}
			else{
				System.out.println("Invalid Input .....");
			}
		}
		catch(InputMismatchException e){
			System.out.println("Invalid Input....");
		}
	}
}