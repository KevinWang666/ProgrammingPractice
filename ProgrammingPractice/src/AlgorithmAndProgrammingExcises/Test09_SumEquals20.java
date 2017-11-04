package AlgorithmAndProgrammingExcises;

import java.util.LinkedList;

/*23.	��һ��ʮ�Ź�ʮ�Ÿ���,��ӡ��������ʮ�Ÿ�����������
 ��ӵ���20���Կ�����,ÿ��������ͬһ����ʽ��ֻ����һ��*/

public class Test09_SumEquals20 {

	public static void main(String[] args) {

		int sum = 0;// ��¼ջ��Ԫ�صĺ�
		int n = 1;
		sum += n;
		MyStack.push(n);
		while (n < 20) {
			if (sum == 20) {
				MyStack.print();
				int num1 = MyStack.pop();// ��Ҫȡ������Ԫ��
				int num2 = MyStack.pop();
				if (MyStack.isEmpty()) {
					break;
				}
				sum = sum - num1 + 1;// ���º�
				MyStack.push(n = ++num2);// �ѵڶ���Ԫ�ؼ�һ��ջ
			} else if (sum > 20) {
				int num1 = MyStack.pop();// ��Ҫȡ������Ԫ��
				int num2 = MyStack.pop();
				if (MyStack.isEmpty()) {
					break;
				}
				sum = sum - num1 + 1;// ���º�
				MyStack.push(n = ++num2);// �ѵڶ���Ԫ�ؼ�һ��ջ
			} else {// ��С��20��������ջ
				MyStack.push(++n);
				sum += n;
			}
			// System.out.print("n..." + n + "   ");
			// System.out.print("sum..." + sum + "    ");
			// System.out.println(MyStack.myList);
		}
	}
}

// �����Լ���ջ

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