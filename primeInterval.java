package program;

public class primeInterval {
	public static void main(String[]args)
	{ int i=0;
		int c=0;
		for( i=2;i<=100;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					c=0;
					break;
				}
				
				else
				{
				c=1;
				}
			}
		
		if(c==1)
		{
			System.out.println(i);
		}}
			
	}
}
