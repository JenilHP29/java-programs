import java.util.*;

class Unique_Occurence
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of elements: ");
        int arr_length = sc.nextInt();
        int arr[] = new int[arr_length];
        System.out.println("Enter Elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int freq[] = new int[arr.length];
        Arrays.fill(freq,-1);
        for(int i=0;i<arr.length;i++)
        {
            int count=1;
            if(freq[i]!=-1)
            {
                continue;
            }
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    freq[j]=0;
                }
            }
            freq[i]=count;
        }
        boolean unique = true;
        for(int i=0;i<freq.length && freq[i]!=0;i++)
        {
            for(int j=i+1;j<freq.length && freq[j]!=0;j++)
            {
                if(freq[i]==freq[j])
                {
                    unique = false;
                }
            }
        }
        if(unique)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}