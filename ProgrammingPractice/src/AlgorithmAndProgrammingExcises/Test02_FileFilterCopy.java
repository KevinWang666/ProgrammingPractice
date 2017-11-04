package AlgorithmAndProgrammingExcises;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*编写一个程序，将d:\java目录下的所有.java文件复制到d:\jad目
 录下，并将原来文件的扩展名从.java改为.jad。*/
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
