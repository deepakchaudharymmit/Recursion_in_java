import java.util.Scanner;

class Salution {
    static int PrintSumOnetoN(int n) {
        if (n == 1) {
            return 1;
        }
        return n + PrintSumOnetoN(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Sum is : "+PrintSumOnetoN(n));
    }
}