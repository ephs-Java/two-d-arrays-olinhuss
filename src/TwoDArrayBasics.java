import java.util.Random;

public class TwoDArrayBasics {

	public static void main(String[] args) {
		// Create a 3 x 5 array of ints
		int[][] nums = new int[3][5];
		// Fill the array with random numbers using fillRandom
		fillRandom(nums, 1, 100);
		// test each method you create below.
		printArray(nums);
		int rowTotal = sumRow(nums, 0);
		System.out.println(rowTotal);
		int[] theSums = rowSums(nums);
		print(theSums);
	}
	/*
	 * given the lower and upper bounds of the random numbers
	 * fill an array of random numbers 
	 */
	public static void fillRandom(int[][] nums, int low, int high){
		Random random = new Random();
		for(int r = 0; r < nums.length; r++){
			for(int c = 0; c < nums[0].length; c++){
				nums[r][c] = random.nextInt(high) + low;
			}
		}
	}

	/*
	 * create a method that prints a 2D array
	 */
	public static void printArray(int[][] nums){
		for(int r = 0; r < nums.length; r++){
			System.out.print(" { ");
			for(int c = 0; c < nums[0].length; c++){
				System.out.print(nums[r][c] + ", ");
			}
			System.out.println(" } ");
		}
	}

	/*
	 * return the sum of a row (r) in a 2D array (nums)
	 */
	public static int sumRow(int[][] nums, int row){
		int total = 0;
		for(int c = 0; c < nums[0].length; c++){
			total += nums[row][c];

		}
		return total;
	}


	/*
	 * return an array of row sums of a 2D array (nums)
	 */
	public static int[] rowSums(int[][] nums){
		int[] sums = new int[nums.length];
		for(int r = 0; r < nums.length; r++){
			sums[r] = sumRow(nums, r);
		}
		
		return sums;
	}
	
	public static void print(int[] n){
		System.out.print("{");
		for(int r = 0; r < n.length; r++){
			System.out.print(n[r]);
			System.out.print(", ");
		}
		System.out.print("}");
	}
	/*
	 * check an 1D array for repeats, return true if all 
	 * elements of the array are unique
	 */




	/*
	 * given an array
	 * return the index of the target value, 
	 * return -1 if it is not found
	 */




	/*
	 * return the min value in a 2D array
	 */





	/*
	 * return the max value in a 2D array
	 */





}
