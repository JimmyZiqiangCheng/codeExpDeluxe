import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
class Jimmy{
	// test script
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("please enter the length of the array.");
		int arrayLength = input.nextInt();
		input.nextLine();
		int[] testArray = new int[arrayLength];
		for (int i=0; i<arrayLength; i++){
			System.out.println("enter the element:");
			testArray[i] = input.nextInt();
			input.nextLine();

		}
		System.out.println("The number of friendly sequences are:");
		System.out.println(count(testArray));
	}

	// actual script
	public static int count(int[] array){
		int numOfHappy = 0;
		if(array.length <2){
			return 0;
		}
		for (int i=0; i<array.length-1; i++){
			for (int j=i+1; j<array.length; j++){
				boolean isFriendly=true;
				int length = j-i+1;
				// create our Set array with length equal to j-i+1
				Set[] temp = new Set[length];
				for (int k=0; k<length; k++){
					temp[k]=numToSet(array[i+k]);
				}
				for (int l=1; l<length; l++){
					if (temp[l].equals(temp[0])==false){
						isFriendly=false;
					}
				}
				if(isFriendly==true){
					numOfHappy ++;
				}
			}
		}
		return numOfHappy;
	}

	// turn number into individual chars
	public static Set numToSet(int number){
		String string = Integer.toString(number);
		Set mySet = new HashSet();
		for (int i=0; i<string.length(); i++){
			mySet.add(new Character(string.charAt(i)));
		}
		return mySet;
	}
}