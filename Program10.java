package Loops1;
import java.util.*;
public class Program10 {
	public boolean isPrimeNumber(int n)
	{
		if(n<=1)
		{
			return false;
		}
		else
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		Program10 pr = new Program10();
		boolean b = pr.isPrimeNumber(num);
		if(b)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Composite");
		}
		s.close();
	}
}
