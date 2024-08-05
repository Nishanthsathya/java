abstract class RBI
{  
abstract void bank();  
}  

class indian_bank extends RBI
{  
void bank()
{
System.out.println("intrest rate in indian bank:6.65");
}  
} 
 
class IOB extends  RBI
{  
void bank()
{
System.out.println("intrest rate in IOB:4.25");
}  
}  

class state_bank extends  RBI
{  
void bank()
{
System.out.println("intrest rate in state bank:3.50");
}  
}  

class KVB extends  RBI
{  
void bank()
{
System.out.println("intrest rate in KVB:7.61");
}  
}  

class city_union_bank extends  RBI
{  
void bank()
{
System.out.println("intrest rate in city union bank:7.85");
}  
}  

class canara_bank extends  RBI
{  
void bank()
{
System.out.println("intrest rate in canara bank:7.50");
}  
}  

class baroda extends  RBI
{  
void bank()
{
System.out.println("intrest rate in bank of baroda:6.85");
}  
}  

class abstract0
{  
public static void main(String args[])
{  
RBI s=new indian_bank();
RBI r=new IOB();
RBI k=new state_bank();
RBI m=new KVB();
RBI n=new city_union_bank();
RBI o=new canara_bank();
RBI p=new baroda();
s.bank();
r.bank(); 
k.bank();
m.bank();
n.bank();
o.bank();
p.bank();
}  
}