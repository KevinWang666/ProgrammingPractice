package arithmetic;

//数组的全排列算法
public class Permutation {

	public static void main(String[] args) {
		String str = "abcdef";
		// 基本思路：首字母+后面字母的全排列，然后后面字母和首字母轮换位置，重复上述过程
		String[] strs = str.split("");
		permutation(strs, 0, strs.length);
	}

	private static void permutation(String[] strs, int begin, int end) {
		// 如果只有一个元素了，依次输出当前排列次的数组元素
		if (begin == end) {
			for (int i = 0; i < strs.length; i++) {
				System.out.print(strs[i]);
			}
			System.out.println();// 换行
		} else {// 否则，将每一个元素都作为首元素（begin），再加上后面len - 1个元素的全排列
			for (int i = begin; i < strs.length; i++) {
				swap(strs, begin, i);// 交换到首位
				permutation(strs, begin + 1, end);
				swap(strs, begin, i);// 再换回来，下轮让后一个元素作为首位
			}
		}
	}

	private static void swap(String[] strs, int i, int j) {
		String temp = strs[i];
		strs[i] = strs[j];
		strs[j] = temp;
	}

}
