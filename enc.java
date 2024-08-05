class enc1
{
private int a=32;
public int getter()
{
return a;
}
public void setter(int dark)
{
a=dark;
}
}
class enc2
{
public static void main(String args[])
{
enc1 enc=new enc1();
System.out.println(enc.getter());

enc.setter(13);
System.out.println(enc.getter());
}
}