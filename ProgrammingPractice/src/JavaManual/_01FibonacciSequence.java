package JavaManual;

/*
 * ��Ŀ���ŵ����⣺
 * ��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�
 * С���ӳ����������º�ÿ��������һ�����ӣ�
 * �������Ӷ���������ÿ���µ���������Ϊ����?
 */
public class _01FibonacciSequence {

	public static void main(String[] args) {
		//������ �Ժ� ��  ÿ   һ   ��   ��  ���������� 
		int num = 8;
		
		int count = countRabbits(num);
		
		System.out.println(count);	
	}

	private static int countRabbits(int num) {
		if (num == 2 || num == 1) {
			return 1;
		}
		return countRabbits(num - 1) + countRabbits(num - 2);
	}
}
