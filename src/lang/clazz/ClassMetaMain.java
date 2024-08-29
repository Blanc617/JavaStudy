package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
	public static void main(String[] args) throws Exception {
		//Class ��ȸ
		Class clazz = String.class; // 1.Ŭ�������� ��ȸ
		//Class clazz = new String().getClass();// 2.�ν��Ͻ����� ��ȸ
		//Class clazz = Class.forName("java.lang.String"); // 3.���ڿ��� ��ȸ
		
		//��� �ʵ� ���
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
		System.out.println("Field: " + field.getType() + " " +  field.getName());
		       }
		
		
		// ��� �޼��� ���
		Method[] methods = clazz.getDeclaredMethods();
			for (Method method : methods) {
				System.out.println("Method: " + method);
			       }
		
			
		// ���� Ŭ���� ���� ���
		System.out.println("Superclass: " + clazz.getSuperclass().getName());
		
		
		// �������̽� ���� ���
		Class[] interfaces = clazz.getInterfaces();
			for (Class i : interfaces) {
				System.out.println("Interface: " + i.getName());
				       }
				   }
				}