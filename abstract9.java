abstract class exam
{
abstract void marks();
}
class tamil extends exam
{
void marks()
{
System.out.println("tamil mark:85.78");
}
}
class english extends exam
{
void marks()
{
System.out.println("english mark:79.6");
}
}
class maths extends exam
{
void marks()
{
System.out.println("maths mark:87.3");
}
}
class science extends exam
{
void marks()
{
System.out.println("science mark:83.6");
}
}
class social extends exam
{
void marks()
{
System.out.println("social science mark:89.8");
}
}
class abstract9
{
public static void main(String args[])
{
exam t=new tamil();
exam e=new english();
exam m=new maths();
exam s=new science();
exam ss=new social();
t.marks();
e.marks();
m.marks();
s.marks();
ss.marks();
}
}








