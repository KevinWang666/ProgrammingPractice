package JavaManual;
//��s=a+aa+aaa+aaaa+aa...a��ֵ������a��һ�����֡�
//����2+22+222+2222+22222(��ʱ����5�������)������������м��̿��ơ�
public class _08addtion {

	public static void main(String[] args) {
		int num = 2;
		int times = 5;
		int sum = 0;
		//ÿ��Ԫ�صĴ�СΪ��"aaaa"��������������
		
		for (int i = 1; i <= times; i++) {
			//�ֻ�ȡ��ǰԪ�ص�ֵ
			int element = 0;
			for (int j = 0; j < i; j++) {
				element += num * Math.pow(10, j) ;
			}
			System.out.println(element);
			sum += element; 
		}
		System.out.println(sum);
	}

}
