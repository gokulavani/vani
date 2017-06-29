import java.util.*;
public class MultipleTable {
public static void main(String [] args)
{
	Scanner s=new Scanner(System.in);
	int v=s.nextInt();
	int vs=0;
	for(int i=1;i<=10;i++)
	{
		vs=i*v;
		
		System.out.println(v+"x"+i+"="+vs);
	}
}
}
