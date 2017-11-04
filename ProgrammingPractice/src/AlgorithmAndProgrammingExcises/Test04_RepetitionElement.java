package AlgorithmAndProgrammingExcises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

/*���������µ��ı��ļ��ж�ȡ�����е�����������ӡ���ظ����������ظ��Ĵ����������ظ���������
 1,����,28
 2,����,35
 3,����,28
 4,����,35
 5,����,28
 6,����,35
 7,����,28
 8,����,35*/

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
		System.out.println("����ȡ����:");
		System.out.println(hm);
		System.out
				.println("==========================�����ķָ���============================");
		TreeMap<String, Integer> tm = new TreeMap<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				int n = hm.get(o1) - hm.get(o2);
				return n == 0 ? 1 : n;
			}
		});
		tm.putAll(hm);
		System.out.println("�ź�����:");
		System.out.println(tm);
	}

}
