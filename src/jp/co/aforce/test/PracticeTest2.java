package jp.co.aforce.test;

public class PracticeTest2 {
	
	public static void main(String[] args) { 
	
	int x = 10;
	int y = 28;

	double z = 3.14;
	
	int con1=x*y;
	System.out.println(con1);
	
	int con2=y/x;
	System.out.println(con2);
	
	int con3=y%x;
	System.out.println(con3);
	System.out.println(con2+"余り、"+con3+"となる。");
	
	
	double con4=y*z;
	System.out.println(con4);
	
	con4++;
	
	System.out.println(con4);
	
	RandomNumber.compareAge();

}
	
}
