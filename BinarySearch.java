import java.util.Scanner;
public class BinarySearch{
    static boolean Bsearch(int[] arr,int targate,int start, int end) {
        if (start>end) {
            return false;
        }
        int mid=start +(end-start)/2;
        if(arr[mid]==targate)
        {
            return true;
        }
        if(arr[mid]<targate)
        {
            return Bsearch(arr,targate,mid+1,end);
        }
        return Bsearch(arr,targate,start,mid-1);
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
        System.out.print("Enter number for sarch : ");
        int targate=sc.nextInt();
        System.out.println("Search element found : " + Bsearch(arr,targate,0,n-1));
    }
}
