import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number = 	");
		int num = scan.nextInt();
		for (int i = 1; i <= num; i++) 
		{
			if(i%2==0)
			{
				System.out.print(i+"  ");
				System.out.println(i);
			
			}
			else
				System.out.print(i+"  ");
		}
	}
}
