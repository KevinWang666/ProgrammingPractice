package interview;

/*题目：公司进行了一次黑客马拉松大赛，全公司一共分为了N个组，每组一个房间排成一排开始比赛，比赛
 * 结束后没有公布成绩，但是每个组能够看到自己相邻的两个组里比自己成绩低的组的成绩，比赛结束之后
 * 要发奖金，以1w为单位，每个组都至少会发1w的奖金，另外，如果一个组发现自己的奖金没有高于比自己
 * 成绩低的组发的奖金，就会不满意，作为比赛的组织方，根据成绩计算出至少需要发多少奖金才能让所有
 * 的组满意。 
 * 
	输入描述：
	每组数据先输入N，然后N行输入N个正整数，每个数表示每个组的比赛成绩。
	输出描述：
	输出至少需要多少w的奖金
	
	输入
	10
	20 
	32 
	12 
	32 
	45 
	11 
	21 
	31 
	41 
	33
	输出
	20
*/
import java.util.Arrays;
import java.util.Scanner;

public class SOUHU_Bonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入组数：");
		int n = Integer.parseInt(sc.nextLine());
		int[] arr = new int[n];
		int[] bonus = new int[n];
		System.out.println("请输入成绩：");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			bonus[i] = 1;
		}
		System.out.println(Arrays.toString(arr));
		int flag = 0;
		while (flag == 0) {
			flag = 1;
			for (int index_a = 0; index_a < n; index_a++) {
				int a_left = index_a - 1;
				int a_ri = index_a + 1;
				if (index_a == 0) {
					if (arr[index_a] > arr[index_a + 1] && bonus[index_a] <= bonus[index_a + 1]) {
						bonus[index_a]++;
						flag = 0;
					}
				} else if (index_a == n - 1) {
					if (arr[index_a] > arr[index_a - 1] && bonus[index_a] <= bonus[index_a - 1]) {
						bonus[index_a]++;
						flag = 0;
					}
				} else {
					if (arr[index_a] > arr[a_left] && bonus[index_a] <= bonus[a_left]
							|| arr[index_a] > arr[a_ri] && bonus[index_a] <= bonus[a_ri]) {
						bonus[index_a]++;
						flag = 0;
					}
				}
			}
			System.out.println(Arrays.toString(bonus));
		}
		int sum = 0;
		for (int i = 0; i < bonus.length; i++) {
			sum += bonus[i];
		}
		System.out.println(sum);
		sc.close();
	}

}
