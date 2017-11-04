package JavaManual;

import java.util.Arrays;
import java.util.Random;

//有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
public class _36Array01 {

	public static void main(String[] args) {
		// 把原来数组的元素取出来放到新数组里面去
		int num = 10;
		int[] arr = new int[num];
		Random r = new Random();
		for (int i = 0; i < num; i++) {
			arr[i] = r.nextInt(100);
		}
		System.out.println(Arrays.toString(arr));
		//移位步数
		int m = 4;
		System.out.println("前面的元素向后移" + m + "位后：");
		int[] brr = new int[num];
		System.arraycopy(arr, num - m, brr, 0, m);// 先复制arr的后半段
		System.arraycopy(arr, 0, brr, m, num - m);// 再复制前半段
		System.out.println(Arrays.toString(brr));

	}

}
