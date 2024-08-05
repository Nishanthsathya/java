 class cricket
{
abstract void score();
}
class rohit extends cricket
{
void score()
{
System.out.println("rohit sharma scored:13");
}
}
class kholi extends cricket
{
void score()
{
System.out.println("virat kholi scored:4");
}
}
class  pant extends cricket
{
void score()
{
System.out.println("rishabh pant scored:42");
}
}
class patel extends cricket
{
void score()
{
System.out.println("axar patel scored:20");
}
}
class yadav extends cricket
{
void score()
{
System.out.println("surya kumar scored:7");
}
}
class dube extends cricket
{
void score()
{
System.out.println("shivam dube scored:3");
}
}
class pandya extends cricket
{
void score()
{
System.out.println("hardic pandya scored:7");
}
}
class jadeja extends cricket
{
void score()
{
System.out.println("ravi jadeja scored:0");
}
}
class singh extends cricket
{
void score()
{
System.out.println("ashdeep singh scored:9");
}
}
class bumrah extends cricket
{
void score()
{
System.out.println("jasprit bumrah scored:0");
}
}
class siraj extends cricket
{
void score()
{
System.out.println("mohhamad siraj scored:7");
System.out.println("total runs scored by India:119");
}
}

class runs
{
public static void main(String args[])
{
cricket a=new rohit();
cricket b=new kholi();
cricket c=new pant();
cricket d=new patel();
cricket e=new yadav();
cricket f=new dube();
cricket g=new pandya();
cricket h=new jadeja();
cricket i=new singh();
cricket j=new bumrah();
cricket k=new siraj();

a.score();
b.score();
c.score();
d.score();
e.score();
f.score();
g.score();
h.score();
i.score();
j.score();
k.score();
}
}