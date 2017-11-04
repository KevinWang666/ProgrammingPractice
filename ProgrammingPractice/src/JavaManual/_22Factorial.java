package JavaManual;
//利用递归方法求5!
public class _22Factorial {

	public static void main(String[] args) {
		int num = 25;
		long result = getFactorial(num);
		System.out.println(result);
	}
	
	public static long getFactorial(int num){//介于上一题的结果，返回值组好是long类型的数据，就算是long类型num到25就是极限了= =
		return num == 1 ? 1 : num * getFactorial(num - 1);
	}
}
