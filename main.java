import java.util.Scanner;
class main
{
public static void main(String args[])
{
Scanner n=new Scanner(System.in);
int a,b,c;
System.out.println("Enter a value");
a=n.nextInt();
System.out.println("Enter b value");
b=n.nextInt();
System.out.println("Enter c value");
c=n.nextInt();
three p=new three();
System.out.println(p.add(a,b,c));
System.out.println(p.sub(a,b,c));
System.out.println(p.mul(a,b,c));
}
}