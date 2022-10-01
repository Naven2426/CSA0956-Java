import java.util.*;
class sup{
	public sup(float a,float b){
		System.out.println(a+","+b);
	}
}
class sub extends sup{
	public sub(float a,float b){
		
		super(a,b);
	}
	
}
public class org{
public static void main(String args[]){
	try{
	Scanner obj=new Scanner(System.in);
	System.out.print("enter the num 1 : ");
	float n1=obj.nextFloat();
	System.out.print("enter the num 2 : ");
	float n2=obj.nextFloat();
	sub o3=new sub(n1,n2);
	}
	catch(Exception a){
		System.out.println("invalid...............");
	}
	
}
}
