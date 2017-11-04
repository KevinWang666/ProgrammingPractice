package AlgorithmAndProgrammingExcises;
/*一个整数，大于0，不用循环和本地变量，按照n，2n，4n，8n的顺序
递增，当值大于5000时，把值按照指定顺序输出来。
例：n=1237
则输出为：
1237，
2474，
4948，
9896，
9896，
4948，
2474，
1237，
*/
public class Recursion001 {
	
	int[] arr = {};
	{arr = new int[]{10};}

	public static void main(String[] args) {
		int num = 3;
		show(num , num);
	}
	private static void show(int num ,int n) {
		if(num << 3 > 5000){
			if(n == num << 3){
				System.out.println(n);
			}
		}
	}
}
