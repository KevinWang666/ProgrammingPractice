package AlgorithmAndProgrammingExcises;

import java.util.LinkedList;

/*23.	从一到十九共十九个数,打印出利用这十九个整数任意多个
 相加等于20所以可能性,每个数字在同一个算式中只出现一次*/

public class Test09_SumEquals20 {

	public static void main(String[] args) {

		int sum = 0;// 记录栈中元素的和
		int n = 1;
		sum += n;
		MyStack.push(n);
		while (n < 20) {
			if (sum == 20) {
				MyStack.print();
				int num1 = MyStack.pop();// 需要取出两个元素
				int num2 = MyStack.pop();
				if (MyStack.isEmpty()) {
					break;
				}
				sum = sum - num1 + 1;// 更新和
				MyStack.push(n = ++num2);// 把第二个元素加一入栈
			} else if (sum > 20) {
				int num1 = MyStack.pop();// 需要取出两个元素
				int num2 = MyStack.pop();
				if (MyStack.isEmpty()) {
					break;
				}
				sum = sum - num1 + 1;// 更新和
				MyStack.push(n = ++num2);// 把第二个元素加一入栈
			} else {// 和小于20，继续入栈
				MyStack.push(++n);
				sum += n;
			}
			// System.out.print("n..." + n + "   ");
			// System.out.print("sum..." + sum + "    ");
			// System.out.println(MyStack.myList);
		}
	}
}

// 定义自己的栈

class MyStack {
	public static LinkedList<Integer> myList = new LinkedList<>();
	private static int pos = -1;

	public static void push(int num) {
		myList.addLast(num);
		pos++;
	}

	public static int pop() {
		pos--;
		return myList.removeLast();
	}

	public static boolean isEmpty() {
		return pos <= -1;
	}

	public static void print() {
		for (int i : myList) {
			System.out.print(i + "  ");
		}
		System.out.println();
	}
}