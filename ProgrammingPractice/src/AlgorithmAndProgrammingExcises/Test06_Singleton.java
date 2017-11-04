package AlgorithmAndProgrammingExcises;

//дһ��Singleton������
public class Test06_Singleton {

	public static void main(String[] args) {

	}

}

// ����ģʽ
class Singleton01 {
	private static Singleton01 n = new Singleton01();

	public static Singleton01 getNum() {
		return n;
	}
}

// ����ģʽ
class Singleton02 {
	private static Singleton02 n = null;

	public static Singleton02 getNum() {
		if (n == null) {
			synchronized (Singleton02.class) {
				if (n == null) {
					n = new Singleton02();
				}
			}
		}
		return n;
	}
}