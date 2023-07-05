package Loops1;
import java.util.*;
import java.math.BigInteger;
public class Program6 {
	public BigInteger factorial(int n)
	{
		BigInteger f = new BigInteger("1");
		for(int i = 2;i<=n;i++)
		{
			f=f.multiply(BigInteger.valueOf(i));
		}
		return f;		
		
	}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Program1 pr = new Program1();
		System.out.println(pr.factorial(n));
		s.close();
	}
}
