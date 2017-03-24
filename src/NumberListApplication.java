
public class NumberListApplication {
	public static void main (String[]args){
		NumberList myNumber = new NumberList();
		myNumber.addValue(1);
		myNumber.addValue(100000);

		try {
			System.out.println("Smallest value = " + myNumber.getSmallest());
			System.out.println("Largest value = " + myNumber.getLargest());
		} catch (NoNumbersSeenException e){
			System.out.println("The Number List has not yet seen any values to give you a smallest or largest number.");
		}
	}
}
