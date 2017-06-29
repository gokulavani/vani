package program;
import java.util.*;
public class palindrome {
public static void main(String[] args)
{
	Scanner s=new Scanner(System .in);
	String str1=s.next();
 String str2=new StringBuffer(str1).reverse().toString();
 if(str1.equals(str2))
 {
	 System.out.println("Palindrome");
 }
 else
 {
	 System.out.println("Not Palindrome");
 
 }
 s.close();
}
}
