package interview;

import java.util.LinkedList;
import java.util.Scanner;

/*风口之下，猪都能飞。当今中国股市牛市，真可谓“错过等七年”。 给你一个回顾历史的机会，已知
 * 一支股票连续n天的价格走势，以长度为n的整数数组表示，数组中第i个元素（prices[i]）代表该股
 * 票第i天的股价。假设你一开始没有股票，但有至多两次买入1股而后卖出1股的机会，并且买入前一定
 * 要先保证手上没有股票。若两次交易机会都放弃，收益为0。 设法计算你能获得的最大收益。 输入数
 * 值范围：2<=n<=100，0<=prices[i]<=100
 *输入例子:
 *3,8,5,1,7,8
 *输出例子:
 *12
 **/
public class XiaoMiFlyingPig {

	public static void main(String[] args) {
		// 部分有序子列的最大最小值，差值放入一个集合，求集合中两元素相加得到的最大值
		LinkedList<Integer> list = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] ins = input.split(" +");
		for (String str : ins) {
			list.add(Integer.parseInt(str));
		}
		System.out.println(list);// 助于搞定输入了= =，要不要这么麻烦。。
		//定义一个存差值的集合
		LinkedList<Integer> res = new LinkedList<>();
 		
		for (int i = 0; i < ins.length; i++) {
			int len = 1;// 记录子序列长度
			int min = list.get(i);
			int max = list.get(i);
			int earn = 0;// 该轮子序列挣的钱
			for (int j = i + 1; j < ins.length; j++) {
				if (list.get(j) > max) {//后一个元素比当前元素大，子序列长度加一
					max = list.get(i);
						len++;
				}
				if (len == 1) {
					break;
				}
			}
			earn = max - min;
			//存入集合
			res.add(earn);		
		}
		System.out.println(res);
		int maxEarn = getMaxEarn(res);
		System.out.println(maxEarn);
	}

	private static int getMaxEarn(LinkedList<Integer> list) {
		//返回结合中元素两两相加的最大值
		int max = 0;
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if(i == j){
					continue;
				}
				if(list.get(i) + list.get(j) > max){
					max = list.get(i) + list.get(j);
				}
			}
		}
		return max;
	}
}
