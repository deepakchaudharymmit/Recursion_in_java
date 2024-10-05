import java.util.*;

public class MinElementInArray{

    static int MinElement(int[] arr,int index) {
        if (index==1) {
            return arr[0];
        }
      return Math.min(arr[index-1], MinElement(arr,index-1));
      
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
        System.out.println(" Minimum of Array element is : " + MinElement(arr,n));
    }
}
