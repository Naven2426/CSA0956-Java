import java.util.*;
public class org{
	public static void main(String args[]){
		Scanner obj=new Scanner(System.in);
		System.out.print("enter the number : ");
		int n=obj.nextInt();
		int s=0;
		while(n>0){
			if(n%2!=0){
				n=n-1;
				s++;
			}
			s++;
			n/=2;
		}
		System.out.print(s-1);
	}
}
