package AlgorithmAndProgrammingExcises;

/*23.	从一到十九共十九个数,打印出利用这十九个整数任意多个
 相加等于20所以可能性,每个数字在同一个算式中只出现一次*/

public class Test09_SumEquals20_Standar { // 定义自己的栈
	int[] data;
	int position; // 栈顶位置，空栈时为-1

	public Test09_SumEquals20_Standar() {
		data = new int[6];
		position = -1;
	}

	public void put(int i) { // 入栈
		data[++position] = i;
	}

	public int port() { // 出栈，返回int
		int t = data[position];
		position--;
		return t;
	}

	public boolean isEmpety() { // 判断是否为空
		return position == -1 ? true : false;
	}

	public void print() { // 打印符合情况
		for (int i = 0; i <= position; i++) {
			System.out.print(data[i] + "  ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Test09_SumEquals20_Standar stack = new Test09_SumEquals20_Standar(); // 实例一个我们的栈来用
		int total = 0; // 记录栈内的数据之和
		int j = 1;
		stack.put(1); // 先把1压入栈中，从1开始，下一行total=1
		total += 1;
		while (j < 20) { // 这里开始循环，只要在范围内即可
			if (total == 20) { // 关键是这里，当我们满足情况时，先打印。应该出栈两次，因为已经和为20了，
				//若出一个，再往后肯定>20,所以出2个，并将第二次出栈的数+1压入栈，可能还有情况
				stack.print();
				int m = stack.port(); // 出栈
				int n = stack.port(); // 出栈 ，当然n<m！！！！
				total -= m;
				total -= n;
				if (stack.isEmpety() && n == 9)
					break; // 当栈底为9时，已经没有了，因为10+11至少为21了，后面没必要判断了，所有情况都已包括
				else {
					j = n + 1;
					stack.put(j);
					total = total + j;
				}
			} else if (total > 20) {// 这里几乎和上面一样，只是没打印，应该封装起来，会减少代码
				int m = stack.port();
				int n = stack.port();
				total -= m;
				total -= n;
				if (stack.isEmpety() && n == 9)
					break;
				else {
					j = n + 1;
					stack.put(j);
					total = total + j;
				}
			} else {
				stack.put(++j);
				total += j;
			}
		}
	}
}
