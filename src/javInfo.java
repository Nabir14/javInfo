import java.util.Scanner;
import java.lang.Math;

class javInfo {
	public static void main(String[] args) {
		// Initialization Code
		String title = "•    ┳  ┏";
		String title2 = "┓┏┓┓┏┃┏┓╋┏┓";
		String title3 = "┃┗┻┗┛┻┛┗┛┗┛";
		String title4 = "┛";
		System.out.println(title);
		System.out.println(title2);
		System.out.println(title3);
		System.out.println(title4);
		Scanner takeInfo = new Scanner(System.in);
		int randomizerRange = 3-1+1;

		// Input Code
		System.out.println("[Introduce Yourself]");
		System.out.print("Name: ");
		String name = takeInfo.nextLine();
		System.out.print("Age: ");
		int age = takeInfo.nextInt();
		takeInfo.nextLine();
		System.out.print("Passion: ");
		String passion = takeInfo.nextLine();
		int descriptionType = (int)(Math.random() * randomizerRange) + 1;
		String dt1 = "Hello, I am "+name+" of age "+age+" who loves "+passion+".";
                String dt2 = "I am "+name+" and my age is "+age+" while my passion is "+passion+".";
                String dt3 = "Hey! My name is "+name+". I am "+age+" years old. I really like "+passion+".";

		// Generation Code
		System.out.println("Generating...");
		System.out.println("[Generated Description]");
		switch(descriptionType){
			case 1:
				System.out.println(dt1);
				break;
			case 2:
				System.out.println(dt2);
				break;
			case 3:
				System.out.println(dt3);
				break;
			default:
				System.out.println("Type Error!");
		}
	}
}
