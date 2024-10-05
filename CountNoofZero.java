import java.util.Scanner;

public class CountNoofZero{

    static int CountZero(int n,int count) {
        if (n == 0) {
            return count;
        }
      int re=n%10;
      if(re==0)
      {
        return CountZero(n/10,count+1);
      }
      else
      {
        return CountZero(n/10,count);
      }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int count=0;
        System.out.println("Number of zero is : " + CountZero(n,count));
    }
}
