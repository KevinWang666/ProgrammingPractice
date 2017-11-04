package AlgorithmAndProgrammingExcises;

import java.util.Scanner;

//金额转换，阿拉伯数字的金额转换成中国传统的形式如：（￥1011）－>（一千零一拾一元整）输出。
public class Test07_TranferRenMingBi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入金额:");
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder(str);
		str = sb.reverse().toString();
		char[] crr = str.toCharArray();
		System.out.println(crr);
		StringBuilder re = new StringBuilder("");
		for (int i = 0; i < crr.length; i++) {
			String temp = transfer(crr[i] , i);
			if(i % 4 == 3){//千位
				re.append("仟" + temp);
			}else if(i % 4 == 2){//百位
				re.append("佰" + temp);
			}else if(i % 4 == 1){//十位
				re.append("拾" + temp);
			}else if(i == 0){//个位
				re.append(temp);
			}else {//万位
				re.append("万" + temp);
			}
		}
		re.reverse();
		
		re.append("元整");
		String result = re.toString().replaceAll("零[仟,佰,拾]", "零").replaceAll("零万", "万").replaceAll("零+", "零");
		System.out.println(result);
	}

	private static String transfer(char c, int i) {
		String s = null;
		switch (c) {
		case '1':
			s = "壹";
			break;
		case '2':
			s = "贰";
			break;
		case '3':
			s = "叁";
			break;
		case '4':
			s = "肆";
			break;
		case '5':
			s = "伍";
			break;
		case '6':
			s = "陆";
			break;
		case '7':
			s = "柒";
			break;
		case '8':
			s = "捌";
			break;
		case '9':
			s = "玖";
			break;
		case '0':
			s = "零";
			break;

		default:
			break;
		}
		return s;
	}

}
