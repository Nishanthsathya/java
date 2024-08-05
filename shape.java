class shape
{
private int s,r,w,l,a1,a2,a3;
float c;
public void area(int r1,int w1,int l1)
{
s=s1;
r=r1;
w=w1;
l=l1;
//c=c1;
}
public void area()
{
l=12;
w=7;
r=16;
s=9;
c=3.14f;
}
void calculate()
{
a1=w*l;
a2=r*r;
a3=c(s*s);
}
void disp()
{
System.out.println("area of rectangle");
System.out.println("width:"+w+"\t length:"+l+"\t area "+a1);
System.out.println("area of square");
System.out.println("value of r:"+r+"\t area   "+a2);
System.out.println("area of circle");
System.out.println("value of s:"+s+"\t area   "+a3);
}
public static void main(String args[])
{
shape s1=new shape();

s1.area();

s1.calculate();

s1.disp();
}
}
