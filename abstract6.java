abstract class cricket
{  
abstract void score();  
}  

class ABD extends cricket
{  
void score()
{
System.out.println("runs scored by devilliers:133");
}  
} 
 
class kholi extends  cricket
{  
void score()
{
System.out.println("runs scored by virat kholi:101");
}  
}  

class rohit extends  cricket
{  
void score()
{
System.out.println("runs scored by rohit sharma:65");
}  
}  

class dhawan extends cricket
{  
void score()
{
System.out.println("runs scored by shikar dhawan:45");
}  
}  

class warner extends cricket
{  
void score()
{
System.out.println("runs scored by david warner:111");
}  
}  

class miller extends cricket
{  
void score()
{
System.out.println("runs scored by david miller:54");
}  
}  

class head extends cricket
{  
void score()
{
System.out.println("runs scored by travis head:89");
}  
}  

class abstract6
{  
public static void main(String args[])
{  
cricket a=new ABD();
cricket k=new kholi();
cricket r=new rohit();
cricket w=new warner();
cricket d=new dhawan();
cricket m=new miller();
cricket h=new head();
a.score();
k.score(); 
r.score();
w.score();
d.score();
m.score();
h.score();
}  
}