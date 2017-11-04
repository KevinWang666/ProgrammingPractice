package JavaManual;

import java.util.Arrays;

//��һ���Ѿ��ź�������顣������һ������Ҫ��ԭ���Ĺ��ɽ������������С�
public class _30InsertSortedArray {

	public static void main(String[] args) {
	//���ֲ��ң���λҪ����Ԫ���������е�����λ�ã�Ȼ�����ݣ�����Ԫ��
		int[] arr = {1, 2, 3, 6, 9, 10, 15, 20, 25, 30};
		int num = 13;
		//���ֲ��ң��ȶ�λҪ���ҵ�Ԫ������
		//����λ��Ϊ�͸�����ȣ�����������С�ڸ��������ֵ�����λ��
		int min = 0;
		int max = arr.length - 1;
		int index = 0;
		while (max > min) {
			int mid = (max + min) / 2 ;
			if (arr[mid] > num) {
				max = mid - 1;
			}else if (arr[mid] < num) {
				min = mid + 1;
				if (min == max) {//��������λ�����������м�ʱ����ʱϵͳ
								//�жϸ������м���������Ҫ��min��һ
							//һ�������������1.numλ���м� 2.num����ǰһ���� 3.num���ں�һ����
					index = min ;
					break;
				}
			}else {
				index = mid + 1;
				break;
			}
		}
		System.out.println(index);
		//����Ԫ�صķ������ȶ���һ��ԭ���鳤�ȼ�һ�������飬Ȼ���������Ԫ�أ�����������
		int[] results = insert(arr, index, num);
		System.out.println(Arrays.toString(results));
	}

	private static int[] insert(int[] arr, int index, int num) {
		int[] temp = new int[arr.length + 1];
		for (int i = 0; i < temp.length; i++) {
			if (i == index) {
				temp[i] = num;
			}else if( i < index){
				temp[i] = arr[i];
			}else{
				temp[i] = arr[i - 1];
			}
		}
		return temp;
	}
}
