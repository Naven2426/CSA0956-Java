import java.util.*;

public class day34{
	public static void main(String args[]){
		Scanner lol=new Scanner(System.in);
		try{
			int[] arr=new int[20];
			System.out.println("Enter the total no of elements to be entered :");
			int n=lol.nextInt();
			if(n>0){
			for(int i=0;i<n;i++){
				System.out.println("Enter valu of arr["+i+"]");
				arr[i]=lol.nextInt();
			}
			
			int sum=0,temp;
			for(int i=0;i<n;i++){
				sum+=arr[i];
			}
			float mean=sum/n;
			System.out.println("Mean :"+mean);
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					if(arr[i]>arr[j]){
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			int med=n/2;
			if(n%2!=0){
				System.out.println("median : "+arr[med]);
			}
			else if(n%2==0){
				System.out.println("median : "+arr[med-1]);
			}
			int g=0;
			for(int i=0;i<n;i++){
				int c=0;
				for(int j=0;j<n;j++){
					if(arr[i]==arr[j]){
						c++;
					}
				}
				if(c>1){
					g=arr[i];
				}
			}
			System.out.println("mode : "+g);	
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