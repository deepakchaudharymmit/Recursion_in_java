import java.util.Scanner;

public class ProductofDigit {

    static int productDigit(int n) {
        if (n%10 == n) {
            return n;
        }
        return (n%10)* productDigit(n/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int sum=0;
        System.out.println("Product is : " +productDigit(n));
    }
}
