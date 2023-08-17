import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int number = scan.nextInt();
		posNegZero(number);
		scan.close();
	}
	public static void posNegZero(int number) {
		
		if (number > 0);
		System.out.println(number +" is positive");
		if (number < 0);
		System.out.println(number +" is negative");
		if (number == 0);
		System.out.println(number +" is equal to zero");
		
	}

}
