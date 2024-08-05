import java.util.Scanner;
class scan
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a,b,c;
System.out.println("Enter the a value:");
a=s.nextInt();
System.out.println("Enter the b value:");
b=s.nextInt();
System.out.println("the answer c:");
c=(a%b)+(a*b)-(a-b)*(b/a)/(b+a)%(b-a);
System.out.println(c);
}
}



