package JavaManual;
//���õݹ鷽����5!
public class _22Factorial {

	public static void main(String[] args) {
		int num = 25;
		long result = getFactorial(num);
		System.out.println(result);
	}
	
	public static long getFactorial(int num){//������һ��Ľ��������ֵ�����long���͵����ݣ�������long����num��25���Ǽ�����= =
		return num == 1 ? 1 : num * getFactorial(num - 1);
	}
}
