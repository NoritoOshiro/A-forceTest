package jp.co.aforce.test;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class PracticeTest3 {
	
	public static void main(String[] args){
		
	final String[] Tanaka={"1","田中太郎","男性","27"};
	
	System.out.println(Tanaka[1]);
	
	Employee tanaka =new Employee(1,"田中太郎","男性",27);
	Employee sato =new Employee(2,"佐藤花子","女性",22);;
	Employee suzuki =new Employee(3,"鈴木次郎","男性",31);;
	
	LinkedHashSet<Employee> Employees = new LinkedHashSet<>();
	
	Employees.add(tanaka);
	Employees.add(sato);
	Employees.add(suzuki);
	
	for(Employee employee: Employees){
		
		System.out.println("番号は"+ employee.getNumbers()+"、"
		+"名前は"+employee.getNames()+"、"
		+"性別は"+employee.getGender()+"、"
		+"年齢は"+employee.getAges()+"です。");
			
	}
	
	
	LinkedHashMap<String, String> hashmap= new LinkedHashMap<String, String>();
	hashmap.put("国語: ", "90点");
	hashmap.put("数学: ", "80点");
	hashmap.put("英語: ", "65点");
	hashmap.forEach((key,value) -> System.out.println(key + value));
	
	}
	//このコレクションを選んだ理由
	
	//複数のデータを出力する問題で、複数データの同時出力とputした順番通りの出力を行うメソッドがないか調べた所、
	//LinkedListとHashMapのいいとこ取りをしたようなメソッドを発見した為、ぜひ使ってみたいと思った。
	
	//しかし、改善点もちらほら見られた(3つ以上のデータの同時出力ができない。等)
	
}
