package interview;
import java.util.Arrays;

public class HuaWei_String {

	public static void main(String[] args) {
		// 输出字符串集（删除重复字符）

		String str = "asdfghjkasdfghjkasdfghasdasdasal";
		// 将字符串转变为字符数组，从第二个字符开始遍历判断在他之前是否有该字
		// 符，如果没有扩充到新字符串
		char[] ch = str.toCharArray();
		char[] result = new char[1];// 用于存放结果
		result[0] = ch[0];
		for (int i = 1; i < ch.length; i++) {
			int count = 0;// 用于查看判断遍历结束时的索引值
			for (int j = 0; j < i; j++) {
				if (ch[j] == ch[i]) {
					break;
				}
				count++;
			}
			if (count == i) {// 说明这个字符之前没有出现过
				result = Arrays.copyOf(result, result.length + 1);
				result[result.length - 1] = ch[i];
			}
		}
		System.out.println(Arrays.toString(result));
	}
}
