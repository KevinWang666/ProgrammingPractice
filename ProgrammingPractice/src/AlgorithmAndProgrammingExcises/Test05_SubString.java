package AlgorithmAndProgrammingExcises;

import java.util.ArrayList;
import java.util.Scanner;

/*编写一个截取字符串的函数，输入为一个字符串和字节数，输
出为按字节截取的字符串，但要保证汉字不被截取半个，如
“我ABC”，4，应该截取“我AB”，输入“我ABC汉DEF”，6，
应该输出“我ABC”，而不是“我ABC+汉的半个”。*/
public class Test05_SubString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串：");
		String str = sc.nextLine();
		String[] strs = str.split("");
		System.out.println("请输入字节数");
		int n = sc.nextInt();
		ArrayList<String> list = new ArrayList<>();
		for (String string : strs) {
			list.add(string);
		}
		//System.out.println(list);
		int len = 0;
		String re = "";
		while(len < n  ){
			String s = list.remove(0);
			if((len += s.getBytes().length) > n){
				break;
			}
			re += s;
		}
		System.out.println(re);
	}

}
