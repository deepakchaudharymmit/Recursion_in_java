import java.util.Scanner;

public class GCD {

    static int gcd(int a,int b) {
        if (b> a) {
            return gcd(b,a);
        }
        if (b==0) {
            return a;
        }

        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter secound number : ");
        int n2 = sc.nextInt();
        System.out.println("GCD is : " + gcd(n1,n2));
    }
}
