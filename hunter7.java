import java.util.*;
public class hunter4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int s=sc.nextInt();
        System.out.println("Enter the array elements ");
        String sarr[]=new String[s];
        for(int i=0;i<s;i++)
        {
            sarr[i]=sc.next();
        }
        for(int i=0;i<s;i++)
        {
            int c=0;
            for(int j=0;j<s;j++)
            {
                if(sarr[i].equals(sarr[j]))
                {
                count=count+1;
                }
            }
            if(c==1)
            {
                System.out.println("unique number: "+sarr[i]);
                break;
            }
        }
    }
}
