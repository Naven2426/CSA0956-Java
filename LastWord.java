import java.util.*;
public class org{
	public static void main(String args[]){
		Scanner obj=new Scanner(System.in);
		System.out.print("enter the string : ");
		String s=obj.nextLine();
		int c=0,ind=0,n=s.length(),e=0;
		for(int i=0;i<n;i++){
			if(s.charAt(i)>32 && s.charAt(i)<=58 || s.charAt(i)==64){
				e=1;
				break;
			}
			else{
			if(s.charAt(i)==' '){
				ind=i;
			}
		}
		}
		if(ind==0)
			ind=-1;
		for(int i=ind+1;i<n;i++){
			c++;
		}
		if(e==1)
			System.out.println("invalid..........");
		else
		System.out.println("length : "+(c));
	}
}
