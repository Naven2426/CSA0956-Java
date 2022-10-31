import java.util.Scanner;
class ADD
{
public static void main(String[] args)
{
int[][] u={{1,3,4},{2,4,3},{3,4,5}};
int[][] v={{1,3,4},{2,4,3},{1,2,4}};
int[][] w=new int[3][3];
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
w[i][j]=u[i][j]+v[i][j];
System.out.print(w[i][j]+" ");
}
System.out.println();
}
}
}