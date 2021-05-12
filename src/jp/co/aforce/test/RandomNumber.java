package jp.co.aforce.test;

public class RandomNumber {
	
	public static void compareAge(){
		
		int myAge=24;
		
		double randomNumber= Math.random()*100+1;
		
		if(myAge>randomNumber) {
			
			System.out.println("私の方が年上です。");
		}else if(myAge<randomNumber) {
			
			System.out.println("私の方が年下です。");
		}if(myAge==randomNumber) {
			
			System.out.println("私と同い年です。");
		}
	
	}

}
