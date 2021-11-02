package ch01;

class Book {
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.author = author;
		this.title = title ;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title + "," + author;
	}
	
	
}



public class BookTest {

	public static void main(String[] args) {

		Book book = new Book("데미안" , "헤르만 헤세");
		System.out.println(book.toString()); // 재정의 하지 않으면 객체의 주소가 출력
		
		String str = new String("test");
		System.out.println(str.toString()); // 문자열이 출력 (이미 재정의 됨)
		
	}

}
