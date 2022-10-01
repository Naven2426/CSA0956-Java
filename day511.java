import java.util.*;
public class Sum{
	public static void main(String args[]){
		Scanner lol=new Scanner(System.in);
		try{
			System.out.println("Enter N value : ");
			int N=lol.nextInt(),num;
			
			int rem=0,sum=0,z=0,temp=0;
			if(N>0 && N<5){
			if(N==1){
				System.out.println("Enter "+N+" digit number :");
				num=lol.nextInt();
				temp=num;
				if(num>=0 && num<10){
					while(temp>0){
						rem=temp%10;
						sum=sum+rem;
						temp=temp/10;
					}
				}
				else{
					System.out.println("This is not a single digit number....");
				}
			}
			else if(N==2){
				System.out.println("Enter "+N+" digit number :");
				num=lol.nextInt();
				temp=num;
				if(num>=10 && num<100){
					while(temp>0){
						rem=temp%10;
						sum=sum+rem;
						temp=temp/10;
					}
				}
				else{
					System.out.println("This is not a two digit number....");
				}
			}
			else if(N==3){
				System.out.println("Enter "+N+" digit number :");
				num=lol.nextInt();
				temp=num;
				if(num>=100 && num<1000){
					while(temp>0){
						rem=temp%10;
						sum=sum+rem;
						temp=temp/10;
					}
				}
				else{
					System.out.println("This is not a three digit number....");
				}
			}
			else if(N==4){
				System.out.println("Enter "+N+" digit number :");
				num=lol.nextInt();
				temp=num;
				if(num>=1000 && num<10000){
					while(temp>0){
						rem=temp%10;
						sum=sum+rem;
						temp=temp/10;
					}
				}
				else{
					System.out.println("This is not a four digit number....");
				}
			}
			else{
				System.out.println("Invalid Input...");
			}
			
			
			if(temp<=0){
			if(sum<10){
				System.out.println("Sum of "+N+" digit number is :"+sum);

			}
			else{
				System.out.println("Sum is not a single digit...");
			}
			}
			}
			else{
				System.out.println("Maximum is 4 digit only....");
			}
		}
		catch(InputMismatchException e){
			System.out.println("Invalid Input....");
		}
	}
}