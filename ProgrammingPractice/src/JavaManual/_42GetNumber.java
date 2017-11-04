package JavaManual;
/*809*??=800*??+9*??+1
其中??代表的两位数,8*??的结果为两位数，9*??的结果为3位数。
求??代表的两位数，及809*??后的结果。*/
public class _42GetNumber {

	public static void main(String[] args) {
		
		for( int num = 10 ;  num < 100 ; num++){
			if( 8 * num >= 100 || 9 * num >= 1000 ){
				continue;
			}
			if(809 * num == (800 * num + 9 * num + 1)){
				System.out.println(num);
				System.out.println(809 * num);
				break;
			}
		}
	}

}
