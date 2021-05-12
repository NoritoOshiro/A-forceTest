package jp.co.aforce.test;

public class PracticeTest1 {
	
	public static void main(String[] args) {
		
		final double TAX = 0.1;
		
		System.out.println(TAX);
		
		int x=480;
		
		
		double price=x+Math.ceil(x*TAX);
		
		System.out.println("この商品の値段は、" + Math.round(price) + "円です。");
		
		
		String name= "Norito"+""+"Oshiro";

		System.out.println(name);
		
	}
	
}
