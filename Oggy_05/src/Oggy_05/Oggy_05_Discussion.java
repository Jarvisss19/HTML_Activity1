package Oggy_05;

import java.util.Scanner;

public class Oggy_05_Discussion {
	
	static String named, addressed;
	static int aged;

	public Oggy_05_Discussion(String name, String Address, int age) {
		Scanner sc = new Scanner(System.in);
		int g = 0;
		int i;
				System.out.println("Name: ");
				named = sc.nextLine();
				
				System.out.println("Address: ");
				addressed = sc.nextLine();
			
			for(i = 0; i <= g; i++) {
				System.out.println("Age: ");
				if(sc.hasNextInt()) {	
				aged = sc.nextInt();
				}else{
					System.out.println("Error");
					i--;
					sc.next();
				}
			}
			
		named = name;
		addressed = Address;
		aged = age;
	}
	
		public static void main(String[] args) {
	
		
			
			Oggy_05_Discussion obj = new Oggy_05_Discussion(named, addressed, aged);
			
		
		
		}
}
