package assignment2;
import java.util.Scanner;


public class Assignment2 {
	
	public static void main(String[] args) {
		
		int age;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("please enter your age: ");
		age = scan.nextInt();
		
		if(age < 0){
			throw new NegativeAgeException();
		}
		
		else{
			System.out.println("Your Age is " + age);
		}
	}

	
}
