import java.util.*;
public class hunterunique
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        System.out.println("Enter the array elements ");
        String arr[]=new String[s];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.next();
        }
        for(int i=0;i<size;i++)
        {
            int c=0;
            for(int j=0;j<size;j++)
            {
                if(arr[i].equals(arr[j]))
                {
                count=count+1;
                }
            }
            if(c==1)
            {
                System.out.println("unique number: "+arr[i]);
                break;
            }
        }
    }
}
