package interview;

import java.util.Arrays;

//���������ַ���A  B  (ֻ����26��Ӣ���ַ�)  ��������еĹ�������ַ�������������ظ������������
public class WANGYI_GetTheLongestSubString {

	public static void main(String[] args) {
		//���ҳ�ÿ���ַ����е��������ַ�������ŵ������ַ���������
		//�ٸ��Ա������ҳ����������ַ���
		
		String A = "abctyuxyzZYSabclmnuGHASDFZNXCVNOA";
		String B = "abcrASDFsDFXYSOtlmniab";
		
		char[] arr = A.toCharArray();
		
		char[] brr = B.toCharArray();
		
		String[] strsA = new String[0];
		
		String[] strsB = new String[0];
		
		//ȡ��A���Ӵ�����
		strsA = getSubStringsArrays(A, arr, strsA);
		//ȡ��B���Ӵ�����
		strsB = getSubStringsArrays(B, brr, strsB);
		
		System.out.println("A���еĹ����Ӵ���");
		for (int i = 0; i < strsA.length; i++) {
			for (int j = 0; j < strsB.length; j++) {
				if (strsA[i].equals(strsB[j])) {
					System.out.println(strsA[i]);
				}
			}
		}
		
		System.out.println("B���еĹ����Ӵ���");
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
		//1.ȡ��A���Ӵ�����
		for (int i = 0, k = 0; i < arr.length; k++) {
			strsA = (String[]) Arrays.copyOf(strsA, strsA.length + 1);//������
			String str = "" + arr[i];//ƴ�ӵ�һ���ַ�
			int add = 0; //��¼�����Ӵ��ĳ���-1������������������
			for (int j = i ; j < arr.length  - 1; j++) {//�ӵ�ǰ����λ�ÿ�ʼ�жϺ�һ��Ԫ�ص�unicodeֵ�Ƿ��ǵ�ǰԪ�ص�+1
				if( (arr[j] + 1) == arr[j + 1]){//����������ƴ��
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
