import  java.util.Scanner;
class Salution
{
static void PrintNtoOne(int n)
{
if(n==1)
{
System.out.print(1);
return;
}
System.out.print(n+" ");
PrintNtoOne(n-1);

}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number : ");
int n=sc.nextInt();
PrintNtoOne(n);
}
}