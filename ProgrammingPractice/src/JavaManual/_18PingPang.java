package JavaManual;
/*两个乒乓球队进行比赛，各出三人。
甲队为a,b,c三人，乙队为x,y,z三人。已抽签决定比赛名单。
有人向队员打听比赛的名单。
a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。*/
public class _18PingPang {

	public static void main(String[] args) {
		char[] arr = {'a' , 'b' , 'c'};
		char[] brr = {'x' , 'y' , 'z'};
		//正确代码
		for(char a : arr){
			for(char b : brr){
				//先把‘a’输出完
				if((a == 'a' &&  b == 'x') || (a == 'a' &&  b == 'y')){//不能和x匹配
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
		
		//以下是错误示范。。。
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
