import java.lang.Math;

public class NumberList {
	private int count;
	private int sum;
	private int smallest = Integer.MIN_VALUE;
	private int largest = Integer.MAX_VALUE;

	private boolean isModified;

	public NumberList(){
		isModified = false;
		count = 0;
		sum = 0;
	}
	
	public NumberList(int x){
		isModified = true;
		count = 1;
		sum = x;
		smallest = x;
		largest = x;
	}

	public void addValue(int x){
		sum = sum + x;
		count++;
		if (x > largest)
			largest = x;
		else if (x < smallest)
			smallest = x;
	}
	
	public int getLargest(){
		return largest;
	}
	public int getSmallest(){
		return smallest;
	}
}
