import java.util.Scanner;

public class SumOfArrayElement{

    static int SumOfArray(int[] arr,int index) {
        if (index==0) {
            return 0;
        }
      return arr[index-1]+ SumOfArray(arr,index-1);
      
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
        System.out.println(" Sum of Array element is : " + SumOfArray(arr,n));
    }
}
