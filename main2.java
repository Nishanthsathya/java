import java.util.Scanner;
class main2
{
public static void main(String args[])
{

Scanner q=new Scanner(System.in);
int a,b;

System.out.println("Enter a value");
a=q.nextInt();
System.out.println("Enter b value");
b=q.nextInt();

son1 p=new son1();
System.out.println(p.add(a,b));
System.out.println(p.sub(a,b));
System.out.println(p.mul(a,b));

}
}