import java.time.LocalDate; 
class Year
{
	
	public static void main(String[] args){  
		
		LocalDate localDate = LocalDate.of(1947, 11, 4);
		System.out.println(localDate);
		boolean d  = localDate.isLeapYear();
		System.out.println("Is leap Year : "+d);
	}
}
