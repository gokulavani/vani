package program;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args)
	{
		int fact=1;
		int no;
		Scanner s=new Scanner(System.in);
		no=s.nextInt();
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;		
	}
   System.out.println(fact);
   s.close();
   
}

}
