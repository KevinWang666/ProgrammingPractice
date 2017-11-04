package JavaManual;
//有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
public class _20seriesSum {

	public static void main(String[] args) {
		//每一项的分子为前一项的分母，分子为前一项的分子和分母之和
		
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
