package interview;

/*��Ŀ����˾������һ�κڿ������ɴ�����ȫ��˾һ����Ϊ��N���飬ÿ��һ�������ų�һ�ſ�ʼ����������
 * ������û�й����ɼ�������ÿ�����ܹ������Լ����ڵ�����������Լ��ɼ��͵���ĳɼ�����������֮��
 * Ҫ��������1wΪ��λ��ÿ���鶼���ٻᷢ1w�Ľ������⣬���һ���鷢���Լ��Ľ���û�и��ڱ��Լ�
 * �ɼ��͵��鷢�Ľ��𣬾ͻ᲻���⣬��Ϊ��������֯�������ݳɼ������������Ҫ�����ٽ������������
 * �������⡣ 
 * 
	����������
	ÿ������������N��Ȼ��N������N����������ÿ������ʾÿ����ı����ɼ���
	���������
	���������Ҫ����w�Ľ���
	
	����
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
	���
	20
*/
import java.util.Arrays;
import java.util.Scanner;

public class SOUHU_Bonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������������");
		int n = Integer.parseInt(sc.nextLine());
		int[] arr = new int[n];
		int[] bonus = new int[n];
		System.out.println("������ɼ���");
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
