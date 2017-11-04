package arithmetic;

//数组的全排列算法
public class Permutation01 {

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
			/*
			 * for (int i = st; i < crr.length; i++) {//不按照字典序的输出 swap(crr, st,
			 * i); permutation(crr, st + 1, end); swap(crr, st, i); }
			 */
			for (int i = st; i < crr.length; i++) {// 按字典序排列
				rightLoop(crr, st, i);
				permutation(crr, st + 1, end);
				leftLoop(crr, st, i);
			}
		}

	}

	public static void leftLoop(char[] crr, int st, int i) {
		// st + 1到i循环左移 ，st放到i位置
		char t = crr[st];
		for (int j = st + 1; j <= i; j++) {
			crr[j - 1] = crr[j];
		}
		crr[i] = t;
	}

	public static void rightLoop(char[] crr, int st, int i) {
		// st + 1到i循环右移 ，i放到st位置
		char t = crr[i];
		for (int j = i; j > st; j--) {
			crr[j] = crr[j - 1];
		}
		crr[st] = t;
	}

	private static void swap(char[] crr, int j, int i) {
		char temp = crr[i];
		crr[i] = crr[j];
		crr[j] = temp;
	}

}
