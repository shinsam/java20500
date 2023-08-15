package collectionFrameWork;

import java.util.HashMap;

public class HashMapExam {

	public static void main(String[] args) {
		
		//맵(key, Value) 쌍으로 
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("유재석", 10);
		map.put("박명수", 5);
		map.put("김종국", 3);
		
		System.out.println("총 학생 수" +  map.size());
		System.out.println("++++++++++++++");
		
		//조회
		System.out.println("유재석의 점수 : " + map.get("유재석"));
		System.out.println("박명수의 점수 : " + map.get("박명수"));
		System.out.println("김종국의 점수 : " + map.get("김종국"));
		
		System.out.println("++++++++++++++");
		
		//확인
		if(map.containsKey("서장훈")) {
			int point = map.get("서장훈");
			map.put("서장훈", ++point);
			System.out.println("서장훈의 점수 : " + map.get("서장훈"));
		}
		else {
			map.put("서장훈", 1);
			System.out.println("새로 들어온 서장훈 점수 1");
		}
		
		System.out.println("++++++++++++++");
		

		//삭제
		map.remove("유재석");
		System.out.println(map.get("유재석"));
		
		System.out.println("++++++++++++++");
		
		//전체 삭제
		map.clear();
		if(map.isEmpty())
			System.out.println("학생 수 : " + map.size());
		
		System.out.println("++++++++++++++");
		
		//다시 재등록
		map.put("유재석", 10);
		map.put("박명수", 5);
		map.put("김종국", 3);
		
		
		//key 확인, 순서가 보장되지 않음, 키값의 중복도 허용되지 않음
		for (String key : map.keySet()) {
			System.out.println(key);
		}
		
		//value 확인
		for(int value : map.values()) {
			System.out.println(value);
		}
		
		System.out.println("++++++++++++++");
		
		//key 와  value 를 동시에 확인하는 방법
		for (String key : map.keySet()) {
			System.out.println("고객 이름 : " + key + "  포인트 : " + map.get(key));
		}
		
		
		//map 을 쓰고 싶은데 순서를 보장받고 싶다면 LinkedHashMap을 사용
	}

}
