package Loops1;
import java.util.*;
public class Program3 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = (n*(n+1))/2;
		System.out.println(sum);
		s.close();
	}
}
