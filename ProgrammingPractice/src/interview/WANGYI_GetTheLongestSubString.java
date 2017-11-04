package interview;

import java.util.Arrays;

//给定两个字符串A  B  (只包含26个英文字符)  ，输出所有的公共最长子字符串（如果出现重复，则多次输出）
public class WANGYI_GetTheLongestSubString {

	public static void main(String[] args) {
		//先找出每个字符串中的所有子字符串，存放到两个字符串数组中
		//再各自遍历，找出公共的子字符串
		
		String A = "abctyuxyzZYSabclmnuGHASDFZNXCVNOA";
		String B = "abcrASDFsDFXYSOtlmniab";
		
		char[] arr = A.toCharArray();
		
		char[] brr = B.toCharArray();
		
		String[] strsA = new String[0];
		
		String[] strsB = new String[0];
		
		//取得A的子串数组
		strsA = getSubStringsArrays(A, arr, strsA);
		//取得B的子串数组
		strsB = getSubStringsArrays(B, brr, strsB);
		
		System.out.println("A串中的公共子串：");
		for (int i = 0; i < strsA.length; i++) {
			for (int j = 0; j < strsB.length; j++) {
				if (strsA[i].equals(strsB[j])) {
					System.out.println(strsA[i]);
				}
			}
		}
		
		System.out.println("B串中的公共子串：");
		for (int i = 0; i < strsB.length; i++) {
			for (int j = 0; j < strsA.length; j++) {
				if (strsB[i].equals(strsA[j])) {
					System.out.println(strsB[i]);
				}
			}
		}
	}

	public static String[] getSubStringsArrays(String A, char[] arr,
			String[] strsA) {
		//1.取得A的子串数组
		for (int i = 0, k = 0; i < arr.length; k++) {
			strsA = (String[]) Arrays.copyOf(strsA, strsA.length + 1);//先扩容
			String str = "" + arr[i];//拼接第一个字符
			int add = 0; //记录当次子串的长度-1，即数组索引的增量
			for (int j = i ; j < arr.length  - 1; j++) {//从当前索引位置开始判断后一个元素的unicode值是否是当前元素的+1
				if( (arr[j] + 1) == arr[j + 1]){//符合条件，拼接
					str = str + arr[j + 1];
					add++;
				}else{
					i++;
					break;
				}
			}
			i += add;
			strsA[k] = str;
			if (i == A.length() - 1) {
				break;
			}
		}
		return strsA;
	}

}
