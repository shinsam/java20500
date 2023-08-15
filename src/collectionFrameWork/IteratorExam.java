package collectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExam {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		//데이터 추가
		list.add("유재석");
		list.add("아무개");
		list.add("지석진");
		list.add("아무개");
		list.add("김종국");
		list.add("아무개");
		list.add("송지효");
		list.add("하하");
				

		for (String s : list) {
			System.out.println(s);
		}
		
		System.out.println("++++++++++++++++++++");
		
		Iterator<String> it = list.iterator();  //리스트의 맨 처음으로 커서가 이동되어 있음
		System.out.println(it.next());  //유재석이 출력됨
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		
		System.out.println("++++++++++++++++++++");
		//커서를 다시 처음으로 이동해야 함
		it = list.iterator(); //커서를 처음으로 이동함
		while(it.hasNext()) {   //다음에 가져올 데이터가 있는 동안
			System.out.println(it.next());
		}
		System.out.println("++++++++++++++++++++");
		
		//순회하면서 잘못된 데이터를 삭제할 예정
		//커서를 처음으로 이동
		it = list.iterator();
		while(it.hasNext()) {
			String s = it.next();
			if(s.contains("아무개")) {
				it.remove(); //삭제
			}
		}
		
		//삭제된 데이터를 순회하면서 보여줌
		it = list.iterator(); //커서를 처음으로 이동함
		while(it.hasNext()) {   //다음에 가져올 데이터가 있는 동안
			System.out.println(it.next());
		}
		System.out.println("++++++++++++++++++++");
		
	}

}





