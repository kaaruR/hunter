import java.util.Scanner;
public class subset
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the 1st array size");
int size1=sc.nextInt();
int arr1[]=new int[size1];
System.out.println("enter the 2nd array size");
int size2=sc.nextInt();
int arr2[]=new int[size2];
int count=0;
System.out.println("enter the 1st array elements");
for(int i=0;i<size1;i++)
{
arr1[i]=sc.nextInt();
}
System.out.println("enter the 2nd array elements");
for(int j=0;j<size2;j++)
{
arr2[j]=sc.nextInt();
}
for(int k=0;k<size1;k++)
{
for(int l=0;l<size2;l++)
{
if(arr1[k]==arr2[l])
{
count=count+1;
}
}
}
