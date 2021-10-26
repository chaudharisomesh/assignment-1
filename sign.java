class sign{
static boolean oppsign(int x, int y){
return ((x^y)<0);
}
public static void main(String args[])

{
int x=Integer.parseInt(args[0]);
int y=Integer.parseInt(args[1]);
if (oppsign(x,y)== true)
System.out.println("sign are opposite");
else
System.out.println("sign are not opposite");
}
}