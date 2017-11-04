package JavaManual;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中
 * 是加密的，加密规则如下：每位数字都加上5,然后用和除以10的余数
 * 代替该数字，再将第一位和第四位交换，第二位和第三位交换。
 * */
public class _48TestCode {

	public static void main(String[] args) {
		// 首位有可能是0，所以不能使用int接收数据
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要加密的数：");
		String code = sc.nextLine();
		String[] crr = code.split("");
		for (int i = 0; i < crr.length; i++) {
			System.out.println(crr[i]);
			crr[i] = "" + (Integer.parseInt(crr[i]) + 5) % 10;
			System.out.println(crr[i]);
			System.out.println();
		}
		List<String> list = Arrays.asList(crr);
		Collections.reverse(list);
		String result = "";
		for (String string : list) {
			result += string;
		}
		System.out.println("结果为：" + result);
	}
}
