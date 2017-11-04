package AlgorithmAndProgrammingExcises;

/*23.	��һ��ʮ�Ź�ʮ�Ÿ���,��ӡ��������ʮ�Ÿ�����������
 ��ӵ���20���Կ�����,ÿ��������ͬһ����ʽ��ֻ����һ��*/

public class Test09_SumEquals20_Standar { // �����Լ���ջ
	int[] data;
	int position; // ջ��λ�ã���ջʱΪ-1

	public Test09_SumEquals20_Standar() {
		data = new int[6];
		position = -1;
	}

	public void put(int i) { // ��ջ
		data[++position] = i;
	}

	public int port() { // ��ջ������int
		int t = data[position];
		position--;
		return t;
	}

	public boolean isEmpety() { // �ж��Ƿ�Ϊ��
		return position == -1 ? true : false;
	}

	public void print() { // ��ӡ�������
		for (int i = 0; i <= position; i++) {
			System.out.print(data[i] + "  ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Test09_SumEquals20_Standar stack = new Test09_SumEquals20_Standar(); // ʵ��һ�����ǵ�ջ����
		int total = 0; // ��¼ջ�ڵ�����֮��
		int j = 1;
		stack.put(1); // �Ȱ�1ѹ��ջ�У���1��ʼ����һ��total=1
		total += 1;
		while (j < 20) { // ���￪ʼѭ����ֻҪ�ڷ�Χ�ڼ���
			if (total == 20) { // �ؼ�������������������ʱ���ȴ�ӡ��Ӧ�ó�ջ���Σ���Ϊ�Ѿ���Ϊ20�ˣ�
				//����һ����������϶�>20,���Գ�2���������ڶ��γ�ջ����+1ѹ��ջ�����ܻ������
				stack.print();
				int m = stack.port(); // ��ջ
				int n = stack.port(); // ��ջ ����Ȼn<m��������
				total -= m;
				total -= n;
				if (stack.isEmpety() && n == 9)
					break; // ��ջ��Ϊ9ʱ���Ѿ�û���ˣ���Ϊ10+11����Ϊ21�ˣ�����û��Ҫ�ж��ˣ�����������Ѱ���
				else {
					j = n + 1;
					stack.put(j);
					total = total + j;
				}
			} else if (total > 20) {// ���Ｘ��������һ����ֻ��û��ӡ��Ӧ�÷�װ����������ٴ���
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
