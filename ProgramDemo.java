import java.util.Scanner;

public class ProgramDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double score = scan.nextDouble();
		System.out.println("Welcome to TechClub");
		eligibityCheck(score);
		scan.close();
		
	}

	public static void eligibityCheck(double score) {
		if(score >=8.0) {
			System.out.println("Welcome to KodNest");
			
		}
	}
	

}
