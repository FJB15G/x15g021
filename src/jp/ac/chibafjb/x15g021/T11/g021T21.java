package jp.ac.chibafjb.x15g021.T11;

import java.util.Scanner;

public class g021T21 {

	public static void main(String[] args) {
			Scanner sin = new Scanner(System.in);
			System.out.print("ハンバーガーの個数 -->");
			int s1 = sin.nextInt();
			System.out.print("フライドポテトの個数 -->");
			int s2 = sin.nextInt();
			System.out.format("ハンバーガーの代金　　　"+"=%d円\n",100*s1);
			int m1 = 100*s1;
			System.out.format("フライドポテトの代金　　"+"=%d円\n",180*s2);
			int m2 = 180*s2;
			System.out.format("小計　　　　　　　　　　"+"=%d円\n",m1+m2);
			System.out.format("消費税　　　　　　　　　"+"=%d円\n",(int )(0.08*(m1+m2)*10/10));
			int s3 = (int )(0.08*(m1+m2)*10/10);
			System.out.format("合計金額　　　　　　　　"+"=%d円\n",m1+m2+s3);
			int g = m1+m2+s3;
			
			System.out.format("受取金額　　　　　　　-->　");
			int u1 = sin.nextInt();
			sin.close();
			System.out.format("合計金額　　　　　　　　"+"=%d円\n",u1-g);
			
			

	}

}

//小計　　　　　　　　　＝　1220円
//
//消費税　　　　　　　　＝　97円
//合計金額　　　　　　　＝　1317円
//
//受取金額　　　    　　　-->　10000
//つり銭　　　　　　　　＝　8683円
//System.out.print("ハンバーガーの代金　　＝　500円");
//System.out.print("フライドポテトの代金　＝　720円");

