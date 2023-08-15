package collectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListExam {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		//데이터 추가
		list.add("유재석");
		list.add("지석진");
		list.add("김종국");
		list.add("송지효");
		list.add("하하");
		
		//데이터 조회 (인덱스)
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		
		System.out.println("+++++++++++++++");
		
		//데이터 삭제
		System.out.println("신청학생수 (삭제전) : " +  list.size());
		list.remove("김종국");
		System.out.println("신청학생수 (삭제후) : " +  list.size());
		
		System.out.println("+++++++++++++++");
		
		System.out.println(list.get(2));
		
		System.out.println("+++++++++++++++");
		
		System.out.println("남은 학생 수(제외전) : " + list.size());
		list.remove(list.size() - 1); //리스트의 마지막 학생 삭제
		System.out.println("남은 학생 수(제외후) : " + list.size());

		System.out.println("+++++++++++++++");
		
		//순회 for(순회할 리스트의 변수형 변수이름 : 리스트의 이름)
		for (String s : list) {
			System.out.println(s);
		}
		
		System.out.println("+++++++++++++++");
		
		//변경 (이름변경)
		System.out.println("이름 변경 전 : " + list.get(0));
		list.set(0, "이수근");
		System.out.println("이름 변경 후 : " + list.get(0));
		
		System.out.println("+++++++++++++++");
		
		//송지효가 몇번째에 포함되어 있는지 인덱스 확인
		System.out.println(list.indexOf("송지효"));
		//포함여부만 확인, true/false 로 확인
		if(list.contains("송지효")) {
			System.out.println("송지효가 포함되어 있군요");
		}
		else {
			System.out.println("송지효가 포함되어 있지 않군요");
		}
		
		System.out.println("+++++++++++++++");
		
		//전체 삭제
		list.clear();
		
		if(list.isEmpty()) {
			System.out.println("학생 수 : " +  list.size());
		}
		
		//데이터 재입력 후 정렬
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
