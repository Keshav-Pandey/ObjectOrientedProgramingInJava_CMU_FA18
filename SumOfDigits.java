import java.util.Scanner;

// Program to find the sum of digits (till we get a single digit answer)
// Ex: 25091994 => 2 + 5 + 0 + 9 + 1 + 9 + 9 + 4 = 39
// 39 => 3 + 9 = 12
// 12 => 2 + 1 = 3
public class SumOfDigits {

	public static void main(String[] args) {
		SumOfDigits n = new SumOfDigits();
		System.out.println("Enter an integer");
		Scanner input = new Scanner(System.in);
        // We expect any integer value, no error handling for garbage values
		int number = input.nextInt();
		System.out.println("Your lucky number is " + n.getLuckyNumber(number));
		input.close();
	}

	
	int getLuckyNumber(int num) {
		// Create variable to save sum of numbers
		int sum = 0;
		// Convert number to positive integer if it's negative
		if (num<0)
			num = num * -1;
		// Add digits while number is greater than 0
		while(num > 0) {
			sum = sum + (num%10);
			num = num/10;
			// If sum becomes more than 9 and we are out of digits perform the function for the sum
			if(sum > 9 && num == 0) {
				num = sum;
				sum = 0;
			}
		}
		return sum;
	}
	

}

