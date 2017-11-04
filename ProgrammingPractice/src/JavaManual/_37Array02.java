package JavaManual;

import java.util.ArrayList;
import java.util.Arrays;

/*有n个人围成一圈，顺序排号。从第一个人开始报数(从1到3报数)，凡报到3的人退出圈子，
 问最后留下的是原来第几号的那位。*/
public class _37Array02 {

	public static void main(String[] args) {
		// 把1到n的数字存放到数组(List更好，因为涉及到删除)里
		int n = 10;
		int count = 1;
		ArrayList<Integer> list = new ArrayList<>();
		while (list.size() < n) {
			list.add(count++);
		}
		System.out.println(list);

		// 循环遍历，数到3去除一次
		int index = 0;
		for (int countNum = 0; countNum < n - 1; countNum++) {// 这里循环n -
																// 1次，留下最后一个用来取值，
			if (index == list.size() - 1) {// 如果索引取到了最大值，那么就归零
				index = 0;
			}
			if ((index + 1) % 3 == 0) {// 由于当前索引不会随着元素的删除而产生变化，所以用索引对3取模，此处加1是因为0索引上存储的是顺序为1的人
				list.remove(index);
			}
			index++;
		}
		int result = list.get(index);// 取出集合中仅剩的一个元素就是留下人的顺序
		System.out.println(result);

	}

}
