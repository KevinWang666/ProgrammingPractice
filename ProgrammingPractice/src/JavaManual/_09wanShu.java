package JavaManual;
//一个数如果恰好等于它的因子之和，这个数就称为"完数"。
//例如6=1+2+3.编程 找出1000以内的所有完数。
public class _09wanShu {

	public static void main(String[] args) {
		int count = 0;//计数器
		//这个程序有问题！！！
		for (int i = 1; i < 1001; i++) {
			int sum = 0;
			for (int j = 1; j <= i / 2; j++) {
				if (i % j == 0) {
					sum += j;
				}	
			}
			if (sum == i) {
				count++;
				System.out.println(i);
			}
		}
		System.out.println("1000以有" + count + "个完数");
	}

}
