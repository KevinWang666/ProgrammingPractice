package JavaManual;
//求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
//例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
public class _08addtion {

	public static void main(String[] args) {
		int num = 2;
		int times = 5;
		int sum = 0;
		//每次元素的大小为："aaaa"解析出来的整数
		
		for (int i = 1; i <= times; i++) {
			//现获取当前元素的值
			int element = 0;
			for (int j = 0; j < i; j++) {
				element += num * Math.pow(10, j) ;
			}
			System.out.println(element);
			sum += element; 
		}
		System.out.println(sum);
	}

}
