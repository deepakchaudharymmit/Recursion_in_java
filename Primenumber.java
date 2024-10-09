import java.util.Scanner;

public class Primenumber {

    static boolean prime(int n,int i) {
        if (n <= 2) {
            return (n==2)?true:false;
        }
        if (n%i==0) {
            return false;
        }
        if (i*i>n) {
            return true;
        }
        return prime(n,i+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Numbar is prime : " + prime(n,2));
    }
}
