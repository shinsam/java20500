package collectionFrameWork;

import java.util.HashSet;

public class HashSetExam {

	public static void main(String[] args) {
		
		//�ߺ��� ������� �ʴ� set, �Է��� ������ �������� ����
		HashSet<String> set = new HashSet<>();
		
		set.add("���缮");
		set.add("������");
		set.add("����ȿ");
		set.add("���缮");
		set.add("������");
		set.add("����");
		set.add("���ҹ�");
		set.add("���缮");
		
		System.out.println("�л� �� : " + set.size());
		
		//��ȸ
		for (String string : set) {
			System.out.println(string);
		}
		
		System.out.println("+++++++++++++++");
		
		//Ȯ��
		if(set.contains("���缮"))
			System.out.println("���缮�� �ֽ��ϴ�.");
		
		System.out.println("+++++++++++++++");
		
		//����
		System.out.println("������ : " + set.size());
		set.remove("���缮");
		System.out.println("������ : " + set.size());
		
		System.out.println("+++++++++++++++");
		
		//��ü ����
		set.clear();
		if(set.isEmpty())
			System.out.println("��ü���� �� �л� �� : " + set.size());
	
		System.out.println("+++++++++++++++");
		
		//set�� ��� �ϴµ� ������ ����ް� �ʹٸ� LinkedHashSet �� ���� ������ �����.�ߺ��� ���ȵ�
	}

}
