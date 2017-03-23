import java.lang.Math;

public class NumberList {
	private int count;
	private int sum;
	private int smallest = Integer.MIN_VALUE;
	private int largest = Integer.MAX_VALUE;

	private boolean isModified = false;

	public NumberList(){
		count = 0;
		sum = 0;
	}
	
	public NumberList(int x){
		addValue(x);
	}

	public void addValue(int x){
		if(!isModified){
			sum = x;
			count = 1;
			smallest = x;
			largest = x;
			isModified = true;
		} else {
			sum = sum + x;
			count++;

			smallest = Math.min(smallest, x);
			largest = Math.max(largest, x);
		}
	}
	
	public int getLargest(){
		return largest;
	}
	public int getSmallest(){
		return smallest;
	}
}
