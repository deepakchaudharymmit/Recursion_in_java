import  java.util.Scanner;
class Salution
{
static void PrintonetoN(int n)
{
if(n==1)
{
System.out.print(1+" ");
return;
}

PrintonetoN(n-1);
System.out.print(n+" ");
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number : ");
int n=sc.nextInt();
PrintonetoN(n);
}
}