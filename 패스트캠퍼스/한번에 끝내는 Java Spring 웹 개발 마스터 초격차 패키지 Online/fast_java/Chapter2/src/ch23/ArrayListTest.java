package ch23;

import java.util.ArrayList;
import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Book> library = new ArrayList<Book>(); //jre 5.0 부터 제공해줌.
		//ArrayList<Book> library = new ArrayList<>();
		// new 쪽 자료형을 최근에는 적지 않아도 해준다.
		
		ArrayList<Integer> array = new ArrayList<>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(1);
		
		int index = 1;
		
		System.out.println(array.indexOf(index));
		
//		
//		library.add(new Book("태백산맥1", "조정래"));
//		library.add(new Book("태백산맥2", "조정래"));
//		library.add(new Book("태백산맥3", "조정래"));
//		library.add(new Book("태백산맥4", "조정래"));
//		library.add(new Book("태백산맥5", "조정래"));
//		
//		// 개수를 설정하지 않으면 10개로 잡고 나중에 더 늘어나면 크기를 늘린다.
//		
//		for(int i = 0; i < library.size(); i++) {
//			library.get(i).showInfo();
//		}
//		
	}

}
