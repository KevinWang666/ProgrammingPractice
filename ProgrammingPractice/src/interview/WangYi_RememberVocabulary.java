package interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/*С�ײ�����һ���ǵ��ʵ�С��Ϸ����Ϸ��ʼϵͳ�ṩ��m����ͬ�ĵ��ʣ�С�׼���һ��ʱ��֮��
 * ��Ҫ��ֽ��д������ס�ĵ��ʡ�С��һ��д����n�����ܼ�ס�ĵ��ʣ����С��д���ĵ�����
 * ��ϵͳ�ṩ�ģ������������ʳ��ȵ�ƽ���ķ�����ע��С��д���ĵ��ʿ����ظ������Ƕ���
 * ÿ����ȷ�ĵ���ֻ�ܼƷ�һ�Ρ�
 *��������:
 *�������ݰ������У�
 *��һ��Ϊ��������n(1 �� n �� 50)��m(1 �� m �� 50)���Կո�ָ�
 *�ڶ���Ϊn���ַ�������ʾС���ܼ�ס�ĵ��ʣ��Կո�ָ���ÿ�����ʵĳ���С�ڵ���50��
 *������Ϊm���ַ�����ϵͳ�ṩ�ĵ��ʣ��Կո�ָ���ÿ�����ʵĳ���С�ڵ���50��
 *�������:
 *���һ��������ʾС���ܻ�õķ���
 *��������:
 *3 4
 *apple orange strawberry
 *strawberry orange grapefruit watermelon 
 *�������:
 *136
 */
public class WangYi_RememberVocabulary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������n��m��");
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		System.out.println("������n����ס�ĵ��ʣ�");
		HashSet<String> hs = new HashSet<>();
		for (int i = 0; i < n; i++) {
			hs.add(sc.next());
		}
		sc.nextLine();
		System.out.println("������m���ʿ��еĵ��ʣ�");
		HashSet<String> hsm = new HashSet<>();
		for(int i =0; i < m  ;i++){
			hsm.add(sc.next());
		}
		sc.nextLine();
		hs.retainAll(hsm);
		int score = 0;
		for (String word : hs) {
			score += word.length() * word.length();
		}
		System.out.println("���յ÷�Ϊ�� " + score);
	}

}
