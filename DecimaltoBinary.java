import java.util.Scanner;

class DecimaltoBinary {
    static int decimaltobinary(int n) {
        if (n == 0) {
            return 0;
        }
        return n%2 + 10* decimaltobinary(n/2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Sum is : "+decimaltobinary(n));
    }
}
