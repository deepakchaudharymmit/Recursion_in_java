import java.util.Scanner;
public class RiverseNumber{
    static int riversnumber(int n,int sum) {
        if (n == 0) {
            return sum;
        }
        sum=sum*10 +n%10;
        return riversnumber(n/10,sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int sum=0;
        System.out.println("Riverse number is : " + riversnumber(n,sum));
    }
}
