public class pali_s
{
    public static void main(String args[])
    {
        String a, b = "";
       String s="somesh";
        System.out.print("Enter the string you want to check:");
      
       int n ;
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }
    }
}
