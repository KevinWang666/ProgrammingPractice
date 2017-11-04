package JavaManual;
/*编写一个函数，输入n为偶数时，
 * 调用函数求1/2+1/4+...+1/n,
 * 当输入n为奇数时，调用函数
 * 1/1+1/3+...+1/n(利用指针函数)*/
public class _39Test {

	public static void main(String[] args) {
		int n = 99;
		double num = getSum(n);
		System.out.println(num);
	}

	private static double getSum(int n) {
		if(n == 0){
			return 0.0;
		}
		if (n == 1) {
			return 1.0;
		}
		return 1.0 / n + getSum(n - 2); 
	}

}
