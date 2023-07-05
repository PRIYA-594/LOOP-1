package Loops1;
import java.util.Scanner;
public class Program8 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = (n*(n+1))/2;
		System.out.println(sum);
		s.close();
	}
}

