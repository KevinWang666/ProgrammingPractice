package AlgorithmAndProgrammingExcises;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/*��дһ�����򣬽�a.txt�ļ��еĵ�����b.txt�ļ��еĵ��ʽ���ϲ�
 ��c.txt�ļ��У�a.txt�ļ��еĵ����ûس����ָ���b.txt�ļ�����
 �س���ո���зָ���*/
public class Test01_MergeTheWord {

	public static void main(String[] args) throws Exception {
		// ��ȡa�ļ�
		ArrayList<String> listA = new ArrayList<>();
		File fa = new File("Test01/a.txt");
		BufferedReader bra = new BufferedReader(new FileReader(fa));
		String stra = null;
		while ((stra = bra.readLine()) != null) {
			listA.add(stra);
		}
		bra.close();
		System.out.println("���a.txt�ļ��ϣ�");
		System.out.println(listA);
		System.out
				.println("================================�����ķָ���=============================================");
		// ��ȡb�ļ�
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
		System.out.println("���b.txt�ļ��ϣ�");
		System.out.println(listB);
		System.out
		.println("================================�����ķָ���=============================================");
		brb.close();

		ArrayList<String> list = new ArrayList<>();
		// ����ϲ�

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
		System.out.println("�ϲ���ļ��ϣ�");
		System.out.println(list);
		
		BufferedWriter bw  = new BufferedWriter(new FileWriter(new File("Test01/result.txt")));
		for (String str : list) {
			bw.write(str);
			bw.newLine();
		}
		bw.close();
	}
}
