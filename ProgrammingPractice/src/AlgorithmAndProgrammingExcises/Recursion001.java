package AlgorithmAndProgrammingExcises;
/*һ������������0������ѭ���ͱ��ر���������n��2n��4n��8n��˳��
��������ֵ����5000ʱ����ֵ����ָ��˳���������
����n=1237
�����Ϊ��
1237��
2474��
4948��
9896��
9896��
4948��
2474��
1237��
*/
public class Recursion001 {
	
	int[] arr = {};
	{arr = new int[]{10};}

	public static void main(String[] args) {
		int num = 3;
		show(num , num);
	}
	private static void show(int num ,int n) {
		if(num << 3 > 5000){
			if(n == num << 3){
				System.out.println(n);
			}
		}
	}
}
