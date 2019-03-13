import java.util.Scanner;

class Jimmy{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("please enter your fence.");
		String testString = input.nextLine();
		System.out.println(getLength(testString));
	}

	public static int getLength(String s){
		int currentLength = 1;
		boolean isFunnyFence = false;
		if (s.length() == 0){
			return 0;
		}
		for (int start=0; start<s.length()-1; start++){
			for (int end=start+1; end<s.length(); end++){
				isFunnyFence=isFunny(s, start, end);
				if (isFunnyFence){
					int next = end-start+1;
					currentLength = (int)Math.max(currentLength,next);
				}
			}
		}
		return currentLength;
	}

	public static boolean isFunny(String s, int start, int end){
		boolean isFunnyFence = true;
		// check if the element next is different
		for (int i=start; i<end; i++){
			if (s.charAt(i)==s.charAt(i+1)){
				isFunnyFence = false;
			}
		}
		return isFunnyFence;
	}
}