package jp.co.aforce.test;
import java.util.Random;

public class PracticeTest5 {
	
	public static void main(String[] args){
		
		Random random=new Random();
		int fortune = random.nextInt(5);
		
//		if(fortune==1) {
//			
//			System.out.println("吉です");
//			
//		}else if(fortune==2) {
//			
//			System.out.println("中吉です");
//			
//		}else if(fortune==3) {
//			
//			System.out.println("大吉です");
//			
//		}else{
//			
//			System.out.println("凶です");
//			
//		}
//		
		switch(fortune) {
		
		case 1:
			
			System.out.println("吉です");
			
			break;
		
		case 2:
			
			System.out.println("中吉です");
			
			break;
			
		case 3:
			
			System.out.println("大吉です");
			
			break;
			
		case 4:
			
			System.out.println("凶です");
			
			break;
			
		}
		
		System.out.println("----------------------------------");
		
		
		int sum=0;
		
		for(int i=1; i<=100; i++) {
			
			if(i%7==0) {
				
				System.out.println(i);
				
				sum = sum+i;
				
			}
			
		}
		
		System.out.println("７の倍数の総合計は"+sum+"です。");
		
		System.out.println("----------------------------------");
		
		
		for(int a=1; a<=9;a++){

			for(int b=1; b<=9; b++){
				
			System.out.print(" " + a*b);

			}

			System.out.println(" ");

			}
		
		System.out.println("----------------------------------");

		
	}

}
