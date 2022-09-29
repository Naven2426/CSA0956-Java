import java.util.Scanner;
public class Counting
{
public static void main(String args[])
{
int ct = 0;
System.out.println("Enter a sentence :");
Scanner ca = new Scanner(System.in);
String sentence = ca.nextLine();
for (int n=0 ; n<sentence.length(); n++)
{
char ch = sentence.charAt(n);
if(ch == 'a'||ch == 'A'||ch == 'e'||ch == 'E'||ch == 'i' ||ch == 'I'||ch == 'o' ||ch == 'O'||ch == 'u'||ch =='U')
{
ct ++;
}
}
System.out.println("Number of vowels in the given sentence is "+ct);
}
}