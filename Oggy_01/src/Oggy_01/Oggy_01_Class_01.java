package Oggy_01;

import java.util.Scanner;

public class Oggy_01_Class_01 {
	String name;
	String address;
	int age;

	
	public void myMethod3() {
			Scanner sc = new Scanner(System.in);
		System.out.println("Name: ");
			name = sc.next();
		System.out.println("Age: ");
			age = sc.nextInt();
		System.out.println("Adress: ");
			address = sc.next();
	}
	
}
