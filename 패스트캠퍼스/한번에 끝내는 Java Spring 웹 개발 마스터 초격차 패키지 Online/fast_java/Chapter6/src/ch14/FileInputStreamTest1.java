package ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");
		}catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				fis.close();
			}catch (IOException e) {
				System.out.println(e);
			}catch (NullPointerException e2) {
				System.out.println(e2);
			}
		}
		
		System.out.println("end");
		
		
	}

}
