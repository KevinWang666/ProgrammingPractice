package JavaManual;
/*
 * 海滩上有一堆桃子，五只猴子来分。第一只猴子把这堆桃子平均分为五份，多了一个，
 * 这只猴子把多的一个扔入海中，拿走了一份。第二只猴子把剩下的桃子又平均分成五
 * 份，又多了一个，它同样把多的一个扔入海中，拿走了一份，第三、第四、第五只猴
 * 子都是这样做的，问海滩上原来最少有多少个桃子?
 * */
public class _41MonkeyPeach {

	public static void main(String[] args) {

		for (int i = 10;; i++) {
			if (find(i, 5)) {
				System.out.println(i);
				break;
			}
		}
	}

	private static boolean find(int i, int j) {
		if ((i - 1) % 5 != 0) {
			return false;
		} else if (j == 1) {
			return true;
		} else {
			int sum = (i - 1) * 4 / 5;
			return find(sum, --j);
		}
	}
}
