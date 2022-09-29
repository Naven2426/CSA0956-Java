import java.util.*;
public class day37{
	public static void main(String agr[]){
		Scanner sc=new Scanner(System.in);
		try{
			int inc;
			System.out.print("Enter a income : ");
			inc=sc.nextInt();
			if(inc>=0)
			{
				if(inc<=250000)
				{
					System.out.print("No Income Tax for You");
				}
				else if(inc>250000 && inc<=300000)
				{
					int inc1=inc-250000;
					int c=(inc1*5)/100;
					System.out.println(inc1);
					System.out.print("Your income tax is "+ c);
				}
				else if(inc>300000 && inc<=400000)
				{
					int inc1=inc-250000;
					int c=(inc1*10)/100;
					System.out.println(inc1);
					System.out.print("Your income tax is "+ c);
				}
				else if(inc>400000 && inc<=500000)
				{
					int inc1=inc-250000;
					int c=(inc1*15)/100;
					System.out.println(inc1);
					System.out.print("Your income tax is "+ c);
				}

				else if(inc>500000 && inc<=700000)
				{
					int inc1=inc-250000;
					int c=(inc1*20)/100;
					System.out.println(inc1);
					System.out.print("Your income tax is "+ c);
				}

				else if(inc>700000 && inc<=900000)
				{
					int inc1=inc-250000;
					int c=(inc1*25)/100;
					System.out.println(inc1);
					System.out.print("Your income tax is "+ c);
				}



				else if (inc>900000) {
					int inc1=inc-250000;
					int c=(inc1*30)/100;
					System.out.println(inc1);
					System.out.print("Your income tax is "+ c);
					
				}
			}
			else
			{
				System.out.print("Invalid Input!!!");
			}

		}
		catch(InputMismatchException a)
		{
			System.out.print("Invalid Input!!!");

		}
		
	
	}
}
