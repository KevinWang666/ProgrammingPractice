package JavaManual;

/*
 * 题目：古典问题：
 * 有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，
 * 假如兔子都不死，问每个月的兔子总数为多少?
 */
public class _01FibonacciSequence {

	public static void main(String[] args) {
		//三个月 以后 的  每   一   个   月  都生！！！ 
		int num = 8;
		
		int count = countRabbits(num);
		
		System.out.println(count);	
	}

	private static int countRabbits(int num) {
		if (num == 2 || num == 1) {
			return 1;
		}
		return countRabbits(num - 1) + countRabbits(num - 2);
	}
}
