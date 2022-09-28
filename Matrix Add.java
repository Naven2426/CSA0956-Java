import java.util.*;
public class matt{
public static void main(String args[]){
Scanner obj=new Scanner(System.in);
try{
int[][] a=new int[50][50];
int[][] b=new int[50][50];
int r,c;
System.out.println("enter the no of rows:");
r=obj.nextInt();
System.out.println("enter the no of coloumns:");
c=obj.nextInt();
if(r>0 && c>0){
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
System.out.println("enter the element for matrix A"+i+":");
a[i][j]=obj.nextInt();
}
}
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
System.out.println("enter the element for matrix B"+i+":");
b[i][j]=obj.nextInt();
}
}
for(int i=0;i<r;i++){
for(int j=0;j<r;j++){
System.out.print(a[i][j]+b[i][j]+" ");
}
System.out.println();
}
}
else{
System.out.println("invalid input:");
}
}
catch(InputMismatchException j){
System.out.println("invalid input:");
}
}
}