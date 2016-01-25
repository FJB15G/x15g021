package jp.ac.chibafjb.x15g021.kd152;

import java.util.Scanner;

public class g021k152 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.print("半径r -->");
		double s1 = sin.nextDouble();
		sin.close();
		System.out.format("円周"+"=%f\n",2*3.14*s1);
		System.out.format("面積"+"=%f\n",3.14*s1*s1);
	}

}
