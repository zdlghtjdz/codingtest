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

		Book book = new Book("���̾�" , "�츣�� �켼");
		System.out.println(book.toString()); // ������ ���� ������ ��ü�� �ּҰ� ���
		
		String str = new String("test");
		System.out.println(str.toString()); // ���ڿ��� ��� (�̹� ������ ��)
		
	}

}
