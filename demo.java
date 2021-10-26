class demo {
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);
int temp, largest;
temp=a>b?a:b;
largest=c>temp?c:temp;
System.out.println("largest number="+largest);
}

}