package AlgorithmAndProgrammingExcises;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/*编写一个程序，将a.txt文件中的单词与b.txt文件中的单词交替合并
 到c.txt文件中，a.txt文件中的单词用回车符分隔，b.txt文件中用
 回车或空格进行分隔。*/
public class Test01_MergeTheWord {

	public static void main(String[] args) throws Exception {
		// 读取a文件
		ArrayList<String> listA = new ArrayList<>();
		File fa = new File("Test01/a.txt");
		BufferedReader bra = new BufferedReader(new FileReader(fa));
		String stra = null;
		while ((stra = bra.readLine()) != null) {
			listA.add(stra);
		}
		bra.close();
		System.out.println("存放a.txt的集合：");
		System.out.println(listA);
		System.out
				.println("================================华丽的分割线=============================================");
		// 读取b文件
		ArrayList<String> listB = new ArrayList<>();
		File fb = new File("Test01/b.txt");
		BufferedReader brb = new BufferedReader(new FileReader(fb));
		String strb = null;
		while ((strb = brb.readLine()) != null) {
			String[] strs = strb.split(" +");
			for (int i = 0; i < strs.length; i++) {
				listB.add(strs[i]);
			}
		}
		System.out.println("存放b.txt的集合：");
		System.out.println(listB);
		System.out
		.println("================================华丽的分割线=============================================");
		brb.close();

		ArrayList<String> list = new ArrayList<>();
		// 交替合并

		int a = 0;
		int b = 0;
		int lengthA = listA.size();
		int lengthB = listB.size();
		String t = "";
		while (a < lengthA && b < lengthB) {
			t = listA.get(a++) + listB.get(b++);
			list.add(t);
		}
		while (a < lengthA) {
			list.add(listA.get(a++));
		}
		while (b < lengthB) {
			list.add(listB.get(b++));
		}
		System.out.println("合并后的集合：");
		System.out.println(list);
		
		BufferedWriter bw  = new BufferedWriter(new FileWriter(new File("Test01/result.txt")));
		for (String str : list) {
			bw.write(str);
			bw.newLine();
		}
		bw.close();
	}
}
