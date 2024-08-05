import java.util.Scanner;
class func
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a,b,c,d;

System.out.println("Enter the a value");
a=s.nextInt();
System.out.println("Enter the b value");
b=s.nextInt();
System.out.println("Enter the c value");
c=s.nextInt();


System.out.println("the answer d is");
d=(a-b)+(b%c)-(c/a)*(c*a)/(b-c)%(a+b);
System.out.println(d);

}

}