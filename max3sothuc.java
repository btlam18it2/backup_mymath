package mymath;

import java.util.Scanner;

public class max3sothuc {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b,c,max;
		Scanner key = new Scanner(System.in);
		System.out.println("Nhap a= ");
		a=key.nextFloat();
		System.out.println("Nhap b= ");
		b=key.nextFloat();
		System.out.println("Nhap c= ");
		c=key.nextFloat();
			if (a>b)
			{if (c>a)
			{
				max=c;
			System.out.println("So lon nhat la: "+max);}
			else 
			{ 
				max=a;
			System.out.println("So lon nhat la:"+max);}
			}
			else
			{
				if (c>b) 
				{max=c;
				System.out.println("So lon nhat la:"+max);
				}
				else 
				{max=b;
				System.out.println("So lon nhat la:"+max);
				}
			}
	}
}

