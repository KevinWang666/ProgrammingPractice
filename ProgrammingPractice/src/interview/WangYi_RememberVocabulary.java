package interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/*小易参与了一个记单词的小游戏。游戏开始系统提供了m个不同的单词，小易记忆一段时间之后
 * 需要在纸上写出他记住的单词。小易一共写出了n个他能记住的单词，如果小易写出的单词是
 * 在系统提供的，将获得这个单词长度的平方的分数。注意小易写出的单词可能重复，但是对于
 * 每个正确的单词只能计分一次。
 *输入描述:
 *输入数据包括三行：
 *第一行为两个整数n(1 ≤ n ≤ 50)和m(1 ≤ m ≤ 50)。以空格分隔
 *第二行为n个字符串，表示小易能记住的单词，以空格分隔，每个单词的长度小于等于50。
 *第三行为m个字符串，系统提供的单词，以空格分隔，每个单词的长度小于等于50。
 *输出描述:
 *输出一个整数表示小易能获得的分数
 *输入例子:
 *3 4
 *apple orange strawberry
 *strawberry orange grapefruit watermelon 
 *输出例子:
 *136
 */
public class WangYi_RememberVocabulary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入n和m：");
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		System.out.println("请输入n个记住的单词：");
		HashSet<String> hs = new HashSet<>();
		for (int i = 0; i < n; i++) {
			hs.add(sc.next());
		}
		sc.nextLine();
		System.out.println("请输入m个词库中的单词：");
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
		System.out.println("最终得分为： " + score);
	}

}
