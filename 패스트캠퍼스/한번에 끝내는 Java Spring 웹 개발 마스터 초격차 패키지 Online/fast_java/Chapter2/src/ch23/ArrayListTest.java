package ch23;

import java.util.ArrayList;
import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Book> library = new ArrayList<Book>(); //jre 5.0 ���� ��������.
		//ArrayList<Book> library = new ArrayList<>();
		// new �� �ڷ����� �ֱٿ��� ���� �ʾƵ� ���ش�.
		
		ArrayList<Integer> array = new ArrayList<>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(1);
		
		int index = 1;
		
		System.out.println(array.indexOf(index));
		
//		
//		library.add(new Book("�¹���1", "������"));
//		library.add(new Book("�¹���2", "������"));
//		library.add(new Book("�¹���3", "������"));
//		library.add(new Book("�¹���4", "������"));
//		library.add(new Book("�¹���5", "������"));
//		
//		// ������ �������� ������ 10���� ��� ���߿� �� �þ�� ũ�⸦ �ø���.
//		
//		for(int i = 0; i < library.size(); i++) {
//			library.get(i).showInfo();
//		}
//		
	}

}
