import java.util.*;
class FriendlySequences {

	public static void main(String[] args) {
		int[] array = { 1,2,3,4};
		count(array);
	}
	public static int count (int [] array) {

		hashset(4554);
		for (int i = 0; i < array.length; i++) {

		}
		return 0;
	}

	public static void hashset( int element) {
		char [] digits = String.valueOf(element).toCharArray();
		Integer[] intDigits = new Integer[digits.length];
		for(int i=0; i<digits.length; i++){
   			intDigits[i] = digits[i]-48;
		}
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(intDigits));
		System.out.println(intDigits);
		System.out.println(set);
        System.out.println("YASSS");

	}
}
