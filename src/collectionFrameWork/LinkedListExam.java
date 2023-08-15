package collectionFrameWork;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list = new LinkedList<>();
		
		//데이터 추가
		list.add("유재석");
		list.add("지석진");
		list.add("김종국");
		list.add("송지효");
		list.add("하하");
		
		//데이터 조회 (인덱스)
		System.out.println(list.get(0));
		System.out.println(list.get(1));

		System.out.println("+++++++++++++++"); 
		
		//링크드리스트는 처음과 마지막 값을 쉽게 접근
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
				
		System.out.println("+++++++++++++++"); 
		
		//추가
		list.addFirst("서장훈"); //리스트의 맨처음에 넣는다	
		list.addLast("김희철"); //리스트의 맨마지막에 넣는다	
		list.add(1, "김영철");  //원하는 위치에 데이터를 넣는다
		
		for (String string : list) {
			System.out.println(string);
		}
		
		System.out.println("+++++++++++++++"); 
		
		//삭제
		System.out.println("남은 학생 수(제외전) : " + list.size());
		list.remove(list.size()-1);
		System.out.println("남은 학생 수(제외후) : " + list.size());
		
		//처음과 마지막 삭제
		list.removeFirst(); //처음데이터 삭제
		list.removeLast(); // 마지막데이터 삭제
		
		for (String string : list) {
			System.out.println(string);
		}
		
		System.out.println("+++++++++++++++"); 
		
		//변경
		list.set(0, "이수근");
		System.out.println(list.get(0));
		
		//김종국이 있는지 확인
		System.out.println(list.indexOf("김종국"));
		if(list.contains("김종국"))
			System.out.println("김종국이 있습니다.");
		else
			System.out.println("김종국이 없습니다.");
	
		System.out.println("+++++++++++++++"); 
		
		//전체삭제
		list.clear();
		if(list.isEmpty())
			System.out.println("학생수 : " + list.size());
	
		System.out.println("+++++++++++++++"); 
		
		
		//새로 데이터 받아서 정렬
		//데이터 추가
		list.add("유재석");
		list.add("지석진");
		list.add("김종국");
		list.add("송지효");
		list.add("하하");
		
		Collections.sort(list);
		for (String string : list) {
			System.out.println(string);
		}
	}
	

}
