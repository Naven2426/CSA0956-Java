import java.util.*;

public class day39{
	public static void main(String args[]){
		Scanner lol=new Scanner(System.in);
		try{
			int n1,sump=0,sumn=0;
			float avgn=0,avgp=0,p=0,n=0;
			do{
				System.out.print("Enter the values :");
				n1=lol.nextInt();
				if(n1>=0){
					sump=sump+n1;
					p++;
				}
				else{
					sumn=sumn+n1;
					n++;
				}
			
			}while(n1!=-1);
			avgp=sump/p;
			avgn=sumn/n;
			System.out.println("Average of Positive Numbers :"+avgp);
			System.out.println("Average of negative numbers :"+avgn);
		}
		
		catch(InputMismatchException e){
			System.out.println("Invalid Input....");
		}
	}
}