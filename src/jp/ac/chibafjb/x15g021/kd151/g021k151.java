package jp.ac.chibafjb.x15g021.kd151;

import java.util.Scanner;

public class g021k151 {

	public static void main(String[] args) {//float
		Scanner sin = new Scanner(System.in);
		System.out.print("aの入力 -->");
		double s1 = sin.nextDouble();
		System.out.print("bの入力 -->");
		double s2 = sin.nextDouble();
		sin.close();
		System.out.format("%f+%f=%f\n",s1,s2,s1+s2);
		System.out.format("%f-%f=%f\n",s1,s2,s1-s2);
		System.out.format("%f*%f=%f\n",s1,s2,s1*s2);
		System.out.format("%f/%f=%f\n",s1,s2,s1/s2);
	}

}
