package AlgorithmAndProgrammingExcises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

/*从类似如下的文本文件中读取出所有的姓名，并打印出重复的姓名和重复的次数，并按重复次数排序：
 1,张三,28
 2,李四,35
 3,张三,28
 4,王五,35
 5,张三,28
 6,李四,35
 7,赵六,28
 8,田七,35*/

public class Test04_RepetitionElement {

	public static void main(String[] args) throws Exception {
		File f = new File("Test04/a.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));

		final HashMap<String, Integer> hm = new HashMap<>();

		String str = null;
		while ((str = br.readLine()) != null) {
			String temp = str.split(",")[1];
			hm.put(temp, hm.containsKey(temp) ? hm.get(temp) + 1 : 1);

		}
		System.out.println("刚提取出来:");
		System.out.println(hm);
		System.out
				.println("==========================华丽的分隔线============================");
		TreeMap<String, Integer> tm = new TreeMap<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				int n = hm.get(o1) - hm.get(o2);
				return n == 0 ? 1 : n;
			}
		});
		tm.putAll(hm);
		System.out.println("排好序了:");
		System.out.println(tm);
	}

}
