package JavaManual;
//��һ�������У�2/1��3/2��5/3��8/5��13/8��21/13...���������е�ǰ20��֮�͡�
public class _20seriesSum {

	public static void main(String[] args) {
		//ÿһ��ķ���Ϊǰһ��ķ�ĸ������Ϊǰһ��ķ��Ӻͷ�ĸ֮��
		
		double sum = 0;
		double fenZi =  1;
		double fenMu =  2;
		int num = 20;
		double expression = 1;
		for (int i = 0; i < num; i++) {
			expression =  fenMu / fenZi;
			System.out.println(expression);
			sum += expression;
			double t = fenZi;
			fenZi = fenMu;
			fenMu = t + fenMu;
		}
		System.out.println(sum);
	}

}
