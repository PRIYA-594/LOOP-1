package Loops1;
import java.util.*;
public class Program4 {
	public static void main(String args[])
	{
		Scanner s  = new Scanner(System.in);
		int num = s.nextInt();
		String str = Integer.toString(num);
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println(sb.toString());
		s.close();
	}
}
