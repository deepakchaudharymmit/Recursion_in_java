import java.util.Scanner;
public class CheckArrayisSortaed{
    static boolean ArrayisSortaed(int[] arr,int index) {
        if (index==arr.length-1) {
            return true;
        }
      return arr[index]<arr[index+1]&&ArrayisSortaed(arr,index+1);
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
        System.out.println("Array is sortaed : " + ArrayisSortaed(arr,0));
    }
}
