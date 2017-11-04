package arithmetic;

//数组的全排列算法
public class Permutation02 {

	public static void main(String[] args) {
		String str = "abcdef";
		char[] crr = str.toCharArray();
		permutation(crr, 0, str.length() - 1);
	}

	private static void permutation(char[] crr, int st, int end) {
		if (st == end) {
			for (int i = 0; i < crr.length; i++) {
				System.out.print(crr[i]);
			}
			System.out.println();

		} else {
			for (int i = st; i < crr.length; i++) {
				rightLoop(crr, st, i);
				permutation(crr, st + 1, end);
				leftLoop(crr, st, i);

			}
		}

	}

	private static void leftLoop(char[] crr, int st, int i) {
		char c = crr[st];
		for (int j = st; j < i ; j++) {
			crr[j] = crr[j + 1];
		}
		crr[i] = c;
	}

	private static void rightLoop(char[] crr, int st, int i) {
		char c = crr[i];
		for (int j = i; j > st; j--) {
			crr[j] = crr[j - 1];
		}
		crr[st] = c;
	}

	private static void swap(char[] crr, int j, int i) {
		char temp = crr[i];
		crr[i] = crr[j];
		crr[j] = temp;
	}

}
