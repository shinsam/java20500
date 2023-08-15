package collectionFrameWork;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list = new LinkedList<>();
		
		//������ �߰�
		list.add("���缮");
		list.add("������");
		list.add("������");
		list.add("����ȿ");
		list.add("����");
		
		//������ ��ȸ (�ε���)
		System.out.println(list.get(0));
		System.out.println(list.get(1));

		System.out.println("+++++++++++++++"); 
		
		//��ũ�帮��Ʈ�� ó���� ������ ���� ���� ����
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
				
		System.out.println("+++++++++++++++"); 
		
		//�߰�
		list.addFirst("������"); //����Ʈ�� ��ó���� �ִ´�	
		list.addLast("����ö"); //����Ʈ�� �Ǹ������� �ִ´�	
		list.add(1, "�迵ö");  //���ϴ� ��ġ�� �����͸� �ִ´�
		
		for (String string : list) {
			System.out.println(string);
		}
		
		System.out.println("+++++++++++++++"); 
		
		//����
		System.out.println("���� �л� ��(������) : " + list.size());
		list.remove(list.size()-1);
		System.out.println("���� �л� ��(������) : " + list.size());
		
		//ó���� ������ ����
		list.removeFirst(); //ó�������� ����
		list.removeLast(); // ������������ ����
		
		for (String string : list) {
			System.out.println(string);
		}
		
		System.out.println("+++++++++++++++"); 
		
		//����
		list.set(0, "�̼���");
		System.out.println(list.get(0));
		
		//�������� �ִ��� Ȯ��
		System.out.println(list.indexOf("������"));
		if(list.contains("������"))
			System.out.println("�������� �ֽ��ϴ�.");
		else
			System.out.println("�������� �����ϴ�.");
	
		System.out.println("+++++++++++++++"); 
		
		//��ü����
		list.clear();
		if(list.isEmpty())
			System.out.println("�л��� : " + list.size());
	
		System.out.println("+++++++++++++++"); 
		
		
		//���� ������ �޾Ƽ� ����
		//������ �߰�
		list.add("���缮");
		list.add("������");
		list.add("������");
		list.add("����ȿ");
		list.add("����");
		
		Collections.sort(list);
		for (String string : list) {
			System.out.println(string);
		}
	}
	

}
