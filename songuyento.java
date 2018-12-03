package mymath;

import java.util.Scanner;

public class songuyento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		Scanner key = new Scanner(System.in);
		System.out.println("Nhap n ");
		n=key.nextInt();
		for (i=2;i<=Math.round(Math.sqrt(n));i++)
			if (n%i==0)
				break;
		if (i<=Math.round(Math.sqrt(n)))
			System.out.println("n khong phai la so nguyen to ");
		else System.out.println("n la so nguyen to ");
	}

}
