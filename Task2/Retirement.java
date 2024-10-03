import java.util.Scanner;

public class Retirement{
	public static void main(String[] args){
		System.out.println("Please type your name");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();

		System.out.println("Hello " + name);

		System.out.println("Please type your age");
		int age =  scanner.nextInt();

		System.out.println("you are  " + age + " years old.");

		int retirementAge = 67;
        int yearsUntilRetire = retirementAge - age;

		System.out.println("You have " + yearsUntilRetire + "years Until retirement");
	}
}