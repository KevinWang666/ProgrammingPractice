package JavaManual;
/*����ƹ����ӽ��б������������ˡ�
�׶�Ϊa,b,c���ˣ��Ҷ�Ϊx,y,z���ˡ��ѳ�ǩ��������������
�������Ա����������������
a˵������x�ȣ�c˵������x,z�ȣ��������ҳ��������ֵ�������*/
public class _18PingPang {

	public static void main(String[] args) {
		char[] arr = {'a' , 'b' , 'c'};
		char[] brr = {'x' , 'y' , 'z'};
		//��ȷ����
		for(char a : arr){
			for(char b : brr){
				//�Ȱѡ�a�������
				if((a == 'a' &&  b == 'x') || (a == 'a' &&  b == 'y')){//���ܺ�xƥ��
						continue;
				}else if(a == 'c' && (b == 'x' || b == 'z')){
						continue;
				}else if(a == 'b' && (b == 'y' || b == 'z')){
						continue;
				}else{
						System.out.println(a + "..." + b);
				}
			}
		}
		
		//�����Ǵ���ʾ��������
		/*for(char a : arr){
			for(char b : brr){
				if((a == 'a' && b == 'x' )|| (a == 'c' && (b == 'x' || b == 'z'))){
					continue;
				}
				System.out.println(a + "   VS	" + b);
			}
		}*/
 	}

}
