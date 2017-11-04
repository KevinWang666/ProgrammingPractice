package JavaManual;
//求0—7所能组成的奇数个数。
public class _43NumberOfOdd {

	public static void main(String[] args) {
		//看尾数就能确定奇偶
		int n = 7;
		int sum = 0	;
		//我的方法
		sum = getSum(sum);
		System.out.println(sum);
		//网上的方法
		test();
	}

	public static void test() {
		long sum1 = 4, s = 4;
		int j;
		for (j = 2; j <= 8; j++) {
			if (j <= 2)
				s *= 7;
			else
				s *= 8;
			sum1 += s;
		}
		System.out.println(sum1);
	}

	public static int getSum(int sum) {
		for(int i = 1 ;i < 9 ;i++){
		if(i == 1){//1位数
			sum += 4;
		}else if(i == 2){//2位数
			sum += 4 * 7;
		}else{
			sum += 4 * (int)Math.pow(8, i - 2) * 7;
		}
		}
		return sum;
	}


}
