package AlgorithmAndProgrammingExcises;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Wtrite2Txt {

	public static void main(String[] args) throws Exception {
		
		// write2a();
		// write2b();
	}

	public static void write2b() throws IOException {
		String str1 = "Peter,I know things have been difficult lately,and I am sorry about that.I thing I know what you are feeling.Ever since you were a little boy.You have been living with so many unresolved things.Well,take it from an old man.Those things send us down the road.And make us who we are.And if anyone¡¯s destined for greatness,it¡¯s you,my son.You owe the world your gifts,you just have to figure out how to use them.And know that wherever they take you ,we¡¯ll always be here.So come home,  peter.You are my hero and I love you. ";
		str1 = str1.replace(',', ' ');
		str1 = str1.replace('.', ' ');
		System.out.println(str1);
		String[] str1s = str1.split(" +");
		File f1 = new File("Test01/b.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(f1));
		Random r = new Random();
		for (String str : str1s) {
			bw.write(str + " ");
			if (r.nextInt(100) % 2 == 0) {
				bw.newLine();
			}
		}
		bw.close();
	}

	public static void write2a() throws IOException {
		String str1 = "It¡¯s easy to feel hopeful on a beautiful day like today. But there will be dark days ahead of us too. There will be days where you feel all alone. And that¡¯s when hope is needed most. No matter how buried it gets, or how lost you feel, you must promise me that you will hold on to hope. Keep it alive. We have to be greater than what we suffer. My wish for you is to become hope. People need that. And even if we fail, what better way is there to live? As we look around here today, at all of the people who helped make us who we are, I know it feels like we¡¯re saying goodbye. But we will carry a piece of each other into everything that we do next. To remind us of who we are, and who we are meant to be. I¡¯ve had a great four years with you, and I will miss you all very much. ";
		str1 = str1.replace(',', ' ');
		str1 = str1.replace('.', ' ');
		String[] str1s = str1.split(" +");
		File f1 = new File("Test01/a.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(f1));
		for (String str : str1s) {
			bw.write(str);
			bw.newLine();
		}
		bw.close();
	}
}
