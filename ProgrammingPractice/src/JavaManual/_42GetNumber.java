package JavaManual;
/*809*??=800*??+9*??+1
����??�������λ��,8*??�Ľ��Ϊ��λ����9*??�Ľ��Ϊ3λ����
��??�������λ������809*??��Ľ����*/
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
