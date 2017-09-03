import java.util.*;
public class hunter4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        System.out.println("Enter the array elements ");
        String arr[]=new String[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.next();
        }
        for(int i=0;i<size;i++)
        {
            int count=0;
            for(int j=0;j<size;j++)
            {
                if(arr[i].equals(arr[j]))
                {
                count=count+1;
                }
            }
            if(count==1)
            {
                System.out.println("unique number: "+arr[i]);
                break;
            }
        }
    }
}
