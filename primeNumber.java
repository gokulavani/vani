package program;
import java.util.*;
public class primeNumber {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
	int n=0;
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0){
				n=1;
			}}
		if(n==0)
		{
			System.out.println("Prime Number");
		}
			else
			{
				System.out.println("Not Prime Number");
			}
	}
}


