import java.util.*;

public class MaxElementInArray{

    static int MaxElement(int[] arr,int index) {
      
        if (index==1)
        {
            return arr[0];
        }
        return Math.max(arr[index-1], MaxElement(arr,index-1));    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(" Maximum of Array element is : " + MaxElement(arr,n));
    }
}
