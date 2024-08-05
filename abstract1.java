abstract class read
{  
abstract void write();  
}  

class word extends read
{  
void write()
{
System.out.println("group of letters is WORD");
}  
}  
class sentence extends read
{  
void write()
{
System.out.println("group of words is SENTENCE");
}  
}  

class abstract1
{  
public static void main(String args[])
{  
read s=new sentence();
read r=new word();
s.write();
r.write(); 

}  
} 
