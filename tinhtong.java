package mymath;

import java.util.Scanner;

public class tinhtong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,s;
		Scanner key = new Scanner(System.in);
				System.out.println("Nhap n ");
					n=key.nextInt();
						 s=0;
						 for (int i=1;i<=n;i+=1)
						 s=s+i;
						 System.out.println("Tong la "+s);
	}

}
