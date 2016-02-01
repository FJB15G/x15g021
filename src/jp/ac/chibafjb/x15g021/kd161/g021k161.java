package jp.ac.chibafjb.x15g021.kd161;

public class g021k161 {
		
public static void main(String[] args) {
	int[] test = {10,20};
	int work = test[1];
	test[1] = test[0];
	test[0] = work;
	int i;
	for(i=0;i<test.length;i++)
		{
	    System.out.println("test["+i+"]="+test[i]);
		}
	
	}
}	
