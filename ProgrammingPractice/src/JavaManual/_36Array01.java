package JavaManual;

import java.util.Arrays;
import java.util.Random;

//��n��������ʹ��ǰ�����˳�������m��λ�ã����m���������ǰ���m����
public class _36Array01 {

	public static void main(String[] args) {
		// ��ԭ�������Ԫ��ȡ�����ŵ�����������ȥ
		int num = 10;
		int[] arr = new int[num];
		Random r = new Random();
		for (int i = 0; i < num; i++) {
			arr[i] = r.nextInt(100);
		}
		System.out.println(Arrays.toString(arr));
		//��λ����
		int m = 4;
		System.out.println("ǰ���Ԫ�������" + m + "λ��");
		int[] brr = new int[num];
		System.arraycopy(arr, num - m, brr, 0, m);// �ȸ���arr�ĺ���
		System.arraycopy(arr, 0, brr, m, num - m);// �ٸ���ǰ���
		System.out.println(Arrays.toString(brr));

	}

}
