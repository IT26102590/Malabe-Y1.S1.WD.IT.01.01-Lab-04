import java.util.Scanner;

public class IT26102590Lab4Q3
{

	public static void main(String[] args)
	{	
		
		String result;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the Number:");
		int number = input.nextInt();
		
		result= (number>0)? "The number is positive":
				(number<0)? "The number is Negative":
				"The number is: Zero";
		
		System.out.println();	
		System.out.println (result ); 
			
			
		
	
	}
 
} 