class exam
{
private int m1,m2,total;
public void setmarks(int ma1,int ma2)
{
	m1=ma1;
	m2=ma2;
}
public void setmarks()
{
	m1=99;
	m2=84;
}
void calculate()
{
	total=m1+m2;
}
void disp()
{
System.out.println("mark1  "+m1+"\t mark2  "+m2+"\t total  "+total);
}
public static void main(String args[])
{
exam e1=new exam();
exam e2=new exam();

e1.setmarks();
e2.setmarks(70,88);
e1.calculate();
e2.calculate();
e1.disp();
e2.disp();
}
}

