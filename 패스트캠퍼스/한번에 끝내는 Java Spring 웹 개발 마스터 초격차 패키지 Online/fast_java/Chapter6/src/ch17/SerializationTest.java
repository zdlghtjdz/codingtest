package ch17;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//class Person implements Serializable {
//	
//	String name;
//	String job;
//	
//	public Person() {
//		
//	}
//	
//	public Person(String name, String job) {
//		this.name = name;
//		this.job = job;
//	}
//	
//	public String toString() {
//		return name + "," + job;
//	}
//	
//	
//}

class Person implements Externalizable {
	
	
	String name;
	String job;
	
	public Person() {
		
	}
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + ',' + job;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
		out.writeUTF(name);
		//out.writeUTF(job);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		name = in.readUTF();
		//job = in.readUTF();
	}
	
	
	
	
}

public class SerializationTest {

	public static void main(String[] args) {
		
		Person personLee = new Person("이순신", "대표이사");
		Person personKim = new Person("김유신", "상무이사");
		
		try(FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			oos.writeObject(personLee);
			oos.writeObject(personKim);
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream oos = new ObjectInputStream(fis)) {
			
			Person p1 = (Person)oos.readObject();
			Person p2 = (Person)oos.readObject();
		
			System.out.println(p1);
			System.out.println(p2);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
