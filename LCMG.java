import java.util.*; 
class LCMGCD
{
	public static void main(String args[])
	{
	    	int a,b;
	    	int gcd,lcm,remainder,numerator,denominator;
 		Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter two Numbers");
	    	a=sc.nextInt();
		b=sc.nextInt();
	    	if (a>b)
		{	
        		numerator=a;
        		denominator=b;
    		}
    		else
    		{
       			numerator=b;
       		 	denominator=a;
	    	}
	    	remainder=numerator%denominator;
    		while(remainder!=0)
    		{
    	   		numerator=denominator;
   		     	denominator=remainder;
       		 	remainder=numerator%denominator;
    		}
    		gcd = denominator;
    		lcm = a*b/gcd;
    		System.out.println("GCD of "+a+" and "+b+" = "+gcd);
    		System.out.println("LCM of "+a+" and "+b+" = "+lcm);
	}
}