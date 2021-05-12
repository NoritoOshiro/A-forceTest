package jp.co.aforce.test;
import java.util.ArrayList;

public class PracticeTest4 {
	
	//練習問題１
	//②番、理由はequalsは文字列の内容を比較しており、==を使って比較する分では基本的にアドレスの参照を行っている為。
	//ちなみに①番の場合、文字列の格納場所が同じかどうかを日比較してしまう。
	
	public static void main(String[] args){
	
		ArrayList<String> Animal= new ArrayList<>();
		Animal.add("犬");
		Animal.add("猫");
		Animal.add("うさぎ");
		Animal.add("へび");
		
		String myFab = "犬";
		
		if(Animal.contains(myFab)) {
			
			System.out.println(myFab+"は、リストに含まれています。");
			
		}else{
				
			System.out.println(myFab+"は、リストに含まれていません。");
			
		}
		
		int myBirth = 11;
		
		switch(myBirth){
			case 1:
				
				System.out.println("元日、成人の日");
				
				break;
			
			case 2:
				
				System.out.println("建国記念の日、天皇誕生日");
				
				break;
			
			case 3:
				
				System.out.println("春分の日");
				
				break;
			
			case 4:
				
				System.out.println("昭和の日");
				
				break;
			
			case 5:
				
				System.out.println("憲法記念日、みどりの日、こどもの日");
				
				break;
			
			case 6:
				
				System.out.println("(なし)");
				
				break;
			
			case 7:
				
				System.out.println("海の日、スポーツの日");
				
				break;
			
			case 8:
	
				System.out.println("山の日");
				
				break;
			
			case 9:
				
				System.out.println("敬老の日、秋分の日");
				
				break;
			
			case 10:
				
				System.out.println("(なし)");
				
				break;
			
			case 11:
	
				System.out.println("文化の日、勤労感謝の日");
				
				break;
			
			case 12:
				
				System.out.println("(なし)");
				
				break;

		}
		//なぜswitch文を選んだか？
				
		//どちらも分岐処理をかける機能だが、今回はcase番号で何月かわかりやすく、多分岐の処理に向いていると思った。
		//逆にもう少し処理が短いとif文の方を使っていたと思う。(いつもif文を使って条件分岐を書いているのでif文で書こうか少し悩みました。)
			
		
		
	
	
    }
	
	
	
}

