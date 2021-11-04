package ch14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIleOutputStreamTest3 {

	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("output3.txt",true)) {
			byte[] bs = new byte[26];
			byte data = 65;
			for(int i = 0 ; i < bs.length; i++) {
				bs[i] = data;
				data++;
			}
			
			fos.write(bs, 3, 5);
		}catch(IOException e) {
			e.printStackTrace();
		}
		

		System.out.println("end");
		
	}

}
