package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		Class c1 = Class.forName("ch04.Person");
		
		Person person = (Person)c1.newInstance(); // ��ȯ���� object
		
		person.setName("Lee");
		System.out.println(person);
		
		Class c2 = person.getClass(); // �ν��Ͻ��� �־�� ��.
		Person p = (Person)c2.newInstance();
		System.out.println(p);
		
		//���ÿ��� Person�� ������ ���.
		
		Class[] parameterTypes = {String.class, int.class};
		Constructor cons = c2.getConstructor(parameterTypes);
		Object[] initargs = {"Kim", 15};
		Person kim = (Person)cons.newInstance(initargs);
		System.out.println(kim);
		System.out.println(kim.getAge());
		
	}

}
