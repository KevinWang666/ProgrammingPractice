package JavaManual;
/*��Ŀ����ӡ������ͼ��(����)
			*
		   ***
		  *****
		 *******
		  *****
		   ***
			*
**/
public class _19PrintRhomb {

	public static void main(String[] args) {
		//���ѭ�������У��ڲ�ѭ������ÿ�е�������
		int num  = 4;
		for (int i = -3; i < num; i++) {
			int temp =  num * 2 - 1 - Math.abs(i) * 2;
			for (int j = 0; j < Math.abs(i) ; j++) {
				System.out.print(" ");
			}
			for(int j = 0 ; j < temp ;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
