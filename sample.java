class sample
{
public int a,b,c;
void sum(int x,int y)
{
System.out.println("add of two number "+(x+y));
}
void sum(int x, int y, int z)
{
System.out.println("add of three  number "+(x+y+z));
}
void product(int x,int y)
{
System.out.println("product of two number "+(x*y));
}
void product(int x,int y,int z)
{
System.out.println("product of two number "+(x*y*z));
}
public static void main(String args[])
{
sample s=new sample();
s.sum(10,20);
s.sum(10,20,30);
s.product(50,62);
s.product(50,62,69);
}
}