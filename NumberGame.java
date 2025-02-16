package codsoft;

import java.util.*;
public class NumberGame {

	public static void main(String[] args) {
		
		
		Random random = new Random();

		int random_number=random.nextInt(100)+1;
		System.out.println(random_number);
		
		
		
		Scanner s = new Scanner(System.in);
		
		int attempt=0;
		while(true) {
			System.out.println("Guess the number 1 to 100 : ");
			int guess_number= s.nextInt();
			attempt++;
			if(guess_number<random_number) {
				System.out.println("Too low");
			}
			else if(guess_number>random_number){
				System.out.println("Too high");
			}
			else {
				System.out.println("Congrats you guessed the correct number in  " +attempt+ "attempt");
				break;
			}
			
			
		}
		
		

	}

}
