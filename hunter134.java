import java.util.*;
public class hunter134
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter any 2 number");
int n1=sc.nextInt();
int n2=sc.nextInt();
int c=0,cc=0,flag=0;
int arr1[]=new int[n1/2];
int arr2[]=new int[n2/2];
for(int i=1;i<n1-1;i++)
{
if(n1%i==0)
{
arr1[c]=i;
c++;
}
}
for(int j=1;j<n2-1;j++)
{
if(n2%j==0)
{
arr2[cc]=j;
cc++;
}
}
for(int k=0;k<c;k++)
{
for(int l=0;l<cc;l++)
{
if(arr1[k]==arr2[l] && arr1[k]!=1 )
{
flag=1;
}
}
}
if(flag==1)
System.out.println("not coprime");
else
System.out.println("coprime");
}
}
