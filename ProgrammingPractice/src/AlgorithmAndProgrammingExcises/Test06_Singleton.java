package AlgorithmAndProgrammingExcises;

//写一个Singleton出来。
public class Test06_Singleton {

	public static void main(String[] args) {

	}

}

// 饿汉模式
class Singleton01 {
	private static Singleton01 n = new Singleton01();

	public static Singleton01 getNum() {
		return n;
	}
}

// 饱汉模式
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