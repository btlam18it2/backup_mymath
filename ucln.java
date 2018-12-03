package mymath;

import java.util.Scanner;

public class ucln {
	public static int comDiv (int a, int b)
	{
	return (b==0)?a:comDiv(b,a%b);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		Scanner key = new Scanner(System.in);
		System.out.println("a= ");
		a = key.nextInt();
		System.out.println("b= ");
		b = key.nextInt();
		System.out.println("UCLN cua "+a+" va "+b+" la "+comDiv(a,b));
	}

}
