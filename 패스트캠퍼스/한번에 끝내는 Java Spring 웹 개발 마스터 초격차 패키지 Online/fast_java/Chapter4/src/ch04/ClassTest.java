package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		Class c1 = Class.forName("ch04.Person");
		
		Person person = (Person)c1.newInstance(); // 반환값이 object
		
		person.setName("Lee");
		System.out.println(person);
		
		Class c2 = person.getClass(); // 인스턴스가 있어야 함.
		Person p = (Person)c2.newInstance();
		System.out.println(p);
		
		//로컬에서 Person이 없을때 사용.
		
		Class[] parameterTypes = {String.class, int.class};
		Constructor cons = c2.getConstructor(parameterTypes);
		Object[] initargs = {"Kim", 15};
		Person kim = (Person)cons.newInstance(initargs);
		System.out.println(kim);
		System.out.println(kim.getAge());
		
	}

}
