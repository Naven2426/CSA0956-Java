import java.util.*;
public class Duplicate
{
public static void main(String args[]){
Scanner lol=new Scanner(System.in);
try
{
System.out.println("Enter the total no of elements :");
int n=lol.nextInt();
if(n>0)
{
System.out.println("Enter the element :");
int[] arr=new int[n],arr1=new int[20];
for(int i=0;i<n;i++){
arr[i]=lol.nextInt();
}
int c=0;
for(int i=0;i<n;i++){
int flag=0;
for(int j=0;j<=c;j++){
if(arr[i]==arr1[j]){
flag=1;
break;
}
else{
flag=0;
}
}
if(flag==0){
arr1[c]=arr[i];
c++;					
}
}
for(int i=0;i<c;i++){
System.out.print(arr1[i]+",");
}
}
else{
System.out.println("Invalid Input...");
}
}
catch(InputMismatchException e){
System.out.println("Invalid Input....");
}
}
}