package AlgorithmAndProgrammingExcises;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*��дһ�����򣬽�d:\javaĿ¼�µ�����.java�ļ����Ƶ�d:\jadĿ
 ¼�£�����ԭ���ļ�����չ����.java��Ϊ.jad��*/
public class Test02_FileFilterCopy {

	public static void main(String[] args) throws Exception {
		File f1 = new File("D:\\Zuikc\\Test\\com\\zuikc");
		File f2 = new File("Test02");
		// f2.mkdir();
		File[] fs = f1.listFiles(new FileFilter() {

			@Override
			public boolean accept(File f) {

				return f.getName().endsWith(".java");
			}

		});
		for (File file : fs) {
			File ft = new File(f2, file.getName().substring(0,
					file.getName().lastIndexOf(".java"))
					+ ".jad");
			FileOutputStream fos = new FileOutputStream(ft);
			FileInputStream fis = new FileInputStream(file);
			byte[] arr = new byte[1024];
			int len;
			while ((len = fis.read(arr)) != -1) {
				fos.write(arr, 0, len);
			}
			fis.close();
			fos.close();
		}

	}

}
