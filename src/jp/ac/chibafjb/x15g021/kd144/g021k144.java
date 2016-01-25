package jp.ac.chibafjb.x15g021.kd144;

import java.util.Scanner;

public class g021k144 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.print("1:住所の入力 -->");
		String s1 = sin.next();
		System.out.print("2:氏名の入力 -->");
		String s2 = sin.next();
		System.out.print("3:電話番号の入力 -->");
		String s3 = sin.next();
		sin.close();
		
		System.out.println("＜確認＞住　　所："+s1);
		System.out.println("        氏　　名："+s2);
		System.out.println("        電話番号："+s3);
	}

}
