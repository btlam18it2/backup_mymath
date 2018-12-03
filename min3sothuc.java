package mymath;

import java.util.Scanner;

public class min3sothuc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b,c,min;
		Scanner key = new Scanner(System.in);
		System.out.println("Nhap a= ");
		a=key.nextFloat();
		System.out.println("Nhap b= ");
		b=key.nextFloat();
		System.out.println("Nhap c= ");
		c=key.nextFloat();
			if (a<b)
			{
				if (c<a)
				{
					min=c;
					System.out.println("So nho nhat la: "+min);
				}
				else 
					min=a;
				System.out.println("So nho nhat la: "+min);
			}
			else 
			{
				if (c<b)
				{
					min=c;
					System.out.println("So nho nhat la: "+min);
				}
				else 
					min=b;
				System.out.println("So nho nhat la: "+min);
			}
	}

}
