package dailyjavaassignmenet;

public class HappyNumber {

	public static int isHappyNumber(int number) {
		int sum = 0;

		int remainder = 0;

		while (number > 0) {
			remainder = number % 10;

			sum = sum + (remainder * remainder);
			number = number / 10;
		}
		return sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 23;
		int happy = number;
		
		while (happy !=1 && happy !=4) {
			happy = isHappyNumber(happy);
		}

		if (happy == 1) {
			System.out.println(number + "the number is happy");
		}
		else
		{
			System.out.println(number + "the number is not happy");
		}

	}
}
