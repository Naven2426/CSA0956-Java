import java.util.*;

public class Vcount{
	public static void main(String args[]){
		Scanner lol=new Scanner(System.in);
		try{
			System.out.println("Enter string :");
			String str=lol.nextLine();
			str=str.toLowerCase();
			char[] arrvow=new char[100],arrcon=new char[100];
			int c=0,v=0;
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)=='a' ||  str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
					arrvow[v]=str.charAt(i);
					v++;
				}
				else{
					arrcon[c]=str.charAt(i);
					c++;
				}
			}
			System.out.println("Vowels :");
			if(v>0){
			for(int i=0;i<v;i++){
				System.out.print(arrvow[i]+" ");
			}}
			else{
				System.out.println("No Vowel Present in given String...");
			}
			System.out.println();
			System.out.println("Consonants :");
			if(c>0){
			for(int i=0;i<c;i++){
				System.out.print(arrcon[i]+" ");
			}
			}
			else{
				System.out.print("No consonant present in given string..");
			}
		}
		catch(InputMismatchException e){
			System.out.println("Invalid Input....");
		}
	}
}