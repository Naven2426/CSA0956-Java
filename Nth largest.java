import java.util.*;
class Day
{
	public static void main(String args[]){
		Scanner lol=new Scanner(System.in);
		try{
			System.out.println("Enter the total no of elements :");
			int n=lol.nextInt(),temp;
			if(n>0){
			System.out.println("Enter the element :");
			int[] arr=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=lol.nextInt();
			}
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					if(arr[i]<arr[j]){
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			System.out.println("Enter value of N :");
			int o=lol.nextInt();
			if(o>0 && o<=n){
			System.out.println("Max of array :"+arr[o-1]);
			}
			else{
					System.out.println("N is Invalid...");
			}}
			else{
				System.out.println("Invalid input...");
			}
		}
		catch(InputMismatchException e){
			System.out.println("Invalid Input....");
		}
	}
}