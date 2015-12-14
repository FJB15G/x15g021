package jp.ac.chibafjb.x15g021.kd142;

import java.util.Scanner;

public class g021k142 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("1:足し算\n2:引き算\n3:かけ算\n4:割り算");
		int value = sin.nextInt();    //整数値の入力
		sin.close();
	
		int a = 1000;
		int b = 25;
		
		if(value == 1)
			System.out.format("%d+%d=%d",a,b,a+b);
		if(value == 2)
			System.out.format("%d-%d=%d",a,b,a-b);
		if(value == 3)
			System.out.format("%d*%d=%d",a,b,a*b);
		if(value == 4)
			System.out.format("%d/%d=%d",a,b,a/b);
	}
}
