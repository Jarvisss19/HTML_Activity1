package Jan_discussion_6;
import java.util.Scanner;

public class Main_01 {
	static Scanner ban = new Scanner(System.in);
	 int x;
	 String named;
	 String addressd;
	public Main_01(String name,String address,int age) {	
		named = name;
		addressd = address;
		x = age;
	
		
	}
	
    public static void main(String[] args) {
		Main_01 obj = new Main_01("Jan","Bil-isan",20);
		System.out.println("Ako deay si " + obj.named);
		System.out.println("Akong edad kay " + obj.x); 
		System.out.println("Taga " + obj.addressd);
		
	}
}
