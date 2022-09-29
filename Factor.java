import java.util.*;

 class Add{
	public static void main(String args[]){
		Scanner lol=new Scanner(System.in);
		try{
			System.out.println("Enter a number to find the Factors :");
			int n=lol.nextInt(),count=0;
			
			int temp=n,rem,flag=1,c=0;
			while(temp>0){
				rem=temp%10;
				if(rem==1) { flag=1; c++; }
				else if(rem==0) { flag=1; c++; }
				else {
					flag=0; 
					break;
				}
				temp=temp/10;
			}
			if(flag!=1 || c<4){
				System.out.println("Factors of given Number :");
			for(int i=1;i<=n;i++){
				if(n%i==0){
					System.out.println(i);
					count++;
				}
			}
			System.out.println("Total number of factors :"+count);
			
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