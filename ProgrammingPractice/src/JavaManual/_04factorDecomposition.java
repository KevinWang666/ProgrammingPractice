package JavaManual;

//将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
public class _04factorDecomposition {

	public static void main(String[] args) {
		// 循环结束条件，商为质数
		int num = 16;
		int divisor = 2;// 除数从2开始
		String result = "";
		int quotient = num;// 商从这个整数本身开始
		while (divisor < num) {// 在循环时，变量的处理上有点绕，可能跟我起的变量名字有关系吧= =

			if (isPrime(quotient)) {// 最后的商为质数，说明是最后一个因式
				result += quotient;
				break;
			}
			if (quotient % divisor == 0) {
				result += divisor + "*";
				quotient = quotient / divisor;
				divisor = 2;
			} else {
				divisor++;
			}
		}
		System.out.println(result);
	}

	private static boolean isPrime(int quotient) {
		if (quotient == 2) {
			return true;
		}
		for (int i = 2; i <= quotient / 2; i++) {
			if (quotient % i == 0) {
				return false;
			}
		}
		return true;
	}
}
