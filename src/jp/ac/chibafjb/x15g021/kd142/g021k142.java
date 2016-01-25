package jp.ac.chibafjb.x15g021.kd142;

import java.util.Scanner;

public class g021k142 {

	public static void main(String[] args) {
		int value;
		Scanner sin = new Scanner(System.in);
		System.out.print("整数aの入力 -->" );
		value = sin.nextInt();
		System.out.print("整数bの入力 -->" );
		int data = sin.nextInt();    //整数値の入力
		sin.close();

		int a = value ;
		int b = data ;
		System.out.format("%d+%d=%d\n",a,b,a+b);
		System.out.format("%d-%d=%d\n",a,b,a-b);
		System.out.format("%d*%d=%d\n",a,b,a*b);
		System.out.format("%d/%d=%d\n",a,b,a/b);
	}
}