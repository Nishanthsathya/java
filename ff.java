class ff
{

static float mul(float a,float n)
{
return a*n;
}
static float div(float a,float n)
{
return a/n;
}
static float sub(float a,float n)
{
return a-n;
}
static float add(float a,float n)
{
return a+n;
}
public static void main(String args[])
{
float v=mul(34.9f,13.5f);
System.out.println(v);
float u=div(34.9f,13.5f);
System.out.println(u);
float t=sub(34.9f,13.5f);
System.out.println(t);

System.out.println(add(34.9f,13.5f));

}

}