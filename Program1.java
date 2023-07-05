package Loops1;
import java.util.*;
public class Program1 {
	public int factorial(int n)
	{
		int fact = 1;
		if(n==0)
		{
			return 1;
		}
		else
		{
			for(int i=1;i<=n;i++)
			{
				fact*=i;
			}
		}
		return fact;
	}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Program1 pr = new Program1();
		int f = pr.factorial(n);
		System.out.println(f);
		s.close();
	}
}
