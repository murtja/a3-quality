import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberListApplication {

	protected static int getSingleValue(){
		Scanner in = new Scanner(System.in);
		return in.nextInt();
	}

	protected static void getMultipleNumbersIntoNumberList(int integerGetCount, NumberList numberList) {
		int validCount = 0;

		while(validCount < integerGetCount) {
			try {
				System.out.println("Please enter an integer #" + (validCount + 1) + " :>");
				int val1 = getSingleValue();
				numberList.addValue(val1);
				validCount++;
			} catch (InputMismatchException e) {
				System.out.println("That was not a valid integer. Please try again.");
			}
		}
	}

	protected static void printLargestSmallest(NumberList numberList){
		try {
			System.out.println("Smallest value = " + numberList.getSmallest());
			System.out.println("Largest value = " + numberList.getLargest());
		} catch (NoNumbersSeenException e){
			System.out.println("The Number List has not yet seen any values to give you a smallest or largest number.");
		}
	}

	public static void main (String[]args){
		NumberList numberList = new NumberList();

		getMultipleNumbersIntoNumberList(4, numberList);

		printLargestSmallest(numberList);
	}
}
