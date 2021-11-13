import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("What is your favorite show?");
		
		//type identifier = new type();
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		System.out.println("Thats a good choice! I also like " + name);
	}
}