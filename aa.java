import java.util.Scanner;
class aa
{
static int a=4;
public static void func(int h,int i,int t )
{
System.out.println((h*i)*t);
}
public static void main(String args[])
{

Scanner s=new Scanner(System.in);
int d,u,e;
d=s.nextInt();
u=s.nextInt();
e=d+u;
System.out.println(e);
System.out.println(a);
func(67,90,87);
//System.out.println(a);
}
}