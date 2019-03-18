import java.util.Scanner;
import java.util.*;
class FriendlySequences {

	public static void main(String[] args) {
	    System.out.println("Please enter the numbers");
        Integer[] array =  getInput();
        System.out.println(count(array));
	}
    public static Integer[] getInput(){
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        String[] numberString = string.split(" ");
        Integer[] numbers = new Integer[numberString.length];
        for(int i = 0; i < numberString.length; i++) {
            numbers[i] = Integer.parseInt(numberString[i]);
        }
        return numbers;
    }
	public static int count (Integer [] array) {
        int count = 0;
        ArrayList<HashSet<Integer>> rows = new ArrayList<HashSet<Integer>>();
		for (int i = 0; i < array.length; i++) {
            rows.add(hashset(array[i]));
		}
        for (int i=0; i < rows.size(); i++) {
            for (int j=1; j < rows.size(); j++) {
                if((rows.get(i)).equals(rows.get(j))) {
                    count++;
                } else {
                    break;
                }
            }
        }
		return count;
	}

	public static HashSet<Integer> hashset( int element) {
		char [] digits = String.valueOf(element).toCharArray();
		Integer[] intDigits = new Integer[digits.length];
		for(int i=0; i<digits.length; i++){
   			intDigits[i] = digits[i]-48;
		}
		HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(intDigits));
		System.out.println(intDigits);
		System.out.println(set);
        return set;
	}
}
