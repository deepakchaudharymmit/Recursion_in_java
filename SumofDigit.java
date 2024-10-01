import java.util.Scanner;

public class SumofDigit {

    static int SumDigit(int n,int sum) {
        if (n == 0) {
            return sum;
        }
      sum=sum+n%10;
        return SumDigit(n/10,sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int sum=0;
        System.out.println("Sum is : " + SumDigit(n,sum));
    }
}
