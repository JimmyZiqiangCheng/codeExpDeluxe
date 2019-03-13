class Jimmy{
	public static void main(String[] args) {
		
	}

	public static int getLength(string s){
		int currentLength = 0
		char[] array = s.toCharArray();
		boolean isFunnyFence = false;
		for (int start=0; start<array.length; start++){
			for (int end=start; end<array.length; end++){
				isFunnyFence=isFunny(array, start, end);
				if (isFunnyFence){
					currentLength = (int)Math.max(currentLength,next);
				}
			}
		}
		return currentLength;
	}

	public static boolean isFunny(char[] array, int start, int end){
		
	}
}