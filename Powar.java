import java.util.Scanner;
public class Power{
    static int powar(int a,int b) {
        if (a==0) {
            return a;
        }
        if (b==0) {
            return 1;
        }
        return  a* powar(a,b-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter powar in number : ");
        int n2 = sc.nextInt();
        System.out.println("Powar is : " + powar(n1,n2));
    }
}
