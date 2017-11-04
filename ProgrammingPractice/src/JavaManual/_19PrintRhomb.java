package JavaManual;
/*题目：打印出如下图案(菱形)
			*
		   ***
		  *****
		 *******
		  *****
		   ***
			*
**/
public class _19PrintRhomb {

	public static void main(String[] args) {
		//外层循环控制行，内层循环控制每行的星星数
		int num  = 4;
		for (int i = -3; i < num; i++) {
			int temp =  num * 2 - 1 - Math.abs(i) * 2;
			for (int j = 0; j < Math.abs(i) ; j++) {
				System.out.print(" ");
			}
			for(int j = 0 ; j < temp ;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
