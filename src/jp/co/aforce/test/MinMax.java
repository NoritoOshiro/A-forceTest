package jp.co.aforce.test;

public class MinMax {
	
	public int getMaxValue(int a,int b,int c){
			
		int max=a;
		
		if(b>a){
			
			max=b;
			
		}else if(c>a) {
			
			
			max=c;
		}
		
		if(b<c){
			
			max=c;
		}
		
		return max;
		
	}
	
	public int getMinValue(int a,int b,int c){
		
		int min=a;
		
		if(b<a){
			
			min=b;
			
		}else if(c<a) {
			
			
			min=c;
		}
		
		if(b>c){
			
			min=c;
		}
		
		return min;
		
	}
		
}