//Importing java.util Package of Scanner Class
import java.util.Scanner;

// Name the Class same as file name 
public class Main 
{
	public static void main(String[] args)
	 {

		// Making object of Scanner Class
		Scanner sc = new Scanner(System.in);

		// Taking input of value of first number
		System.out.print("Enter first number:");
		// Storing the input value of 1st no. in a variable
		double num1 = sc.nextDouble();

		// Taking input of value of second number
		System.out.print("Enter second number:");
		// Storing the input value of 2nd no. in a variable
		double num2 = sc.nextDouble();

		// Asking the user to enter an operator for calculation
		System.out.print("Enter an operator (+, -, *, /): ");
		// Storing that operator in a variable
		char operator = scanner.next().charAt(0);

		// Making a variable to give the answer
		double output;

		// Making Switch Case for calculation of choosen operator
		switch (operator) {

		case '+':
			output = num1 + num2;
			break;

		case '-':
			output = num1 - num2;
			break;

		case '*':
			output = num1 * num2;
			break;

		case '/':
			output = num1 / num2;
			break;

		// If user enters any other operator or char apart from +, -, * and /
		// Then display an error message to user

		default:

			System.out.printf("You have entered wrong operator");
			return;
		}// End of Switch Case

		// Displaying the output
		System.out.println(num1 + " " + operator + " " + num2 + ": " + output);

	}

}