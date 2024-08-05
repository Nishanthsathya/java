class exam0
{
private float a,b,c,d,e,average;
public void setmarks(float a1,float b1,float c1,float d1,float e1)
{
a=a1;
b=b1;
c=c1;
d=d1;
e=e1;
}
public void setmarks()
{
a=66.72f;
b=79.65f;
c=88.56f;
d=82.09f;
e=96.53f;
}
void calculate()
{
average=(a+b+c+d+e)/5;
}
void disp()
{
System.out.println(" ram \t\t"+a+"\n nishanth\t"+b+"\n vicky\t\t"+c+"\n deepan\t\t"+d+"\n abirami\t"+e+"\n\n average\t"+average);
}
public static void main(String args[])
{
exam0 e1=new exam0();
e1.setmarks();
e1.calculate();
e1.disp();
}
}


