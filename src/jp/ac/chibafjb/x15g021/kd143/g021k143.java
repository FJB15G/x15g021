package jp.ac.chibafjb.x15g021.kd143;

import java.util.Scanner;

public class g021k143 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.print("1:住所の入力 -->");
		String s1 = sin.next();
		System.out.print("2:氏名の入力 -->");
		String s2 = sin.next();
		System.out.print("3:電話番号の入力 -->");
		String s3 = sin.next();
		sin.close();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
//		String s1 = ("船橋市本町7-12-16");
//		String s2 = ("船橋太郎");
//		String s3= ("047-425-1051");
	}

}
