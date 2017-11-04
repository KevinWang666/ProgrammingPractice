package JavaManual;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/*有五个学生，每个学生有3门课的成绩，从键盘输入以上
 * 数据(包括学生号，姓名，三门课成绩)，计算出平均成
 * 绩，把原有的数据和计算出的平均分数存放在磁盘文件
 * "stud"中。*/
public class _50Student {

	public static void main(String[] args) throws IOException {
		Student[] stus = new Student[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("请录入五个学生的学生号，姓名，三门课成绩：");
		String id;
		String name;
		int math;
		int chi;
		int eng;
		// 录入信息
		for (int i = 0; i < 2; i++) {
			System.out.println("学生号：");
			id = sc.nextLine();
			System.out.println("姓名：");
			name = sc.nextLine();
			System.out.println("数学成绩：");
			math = sc.nextInt();
			System.out.println("语文成绩：");
			chi = sc.nextInt();
			System.out.println("英语成绩：");
			eng = sc.nextInt();
			stus[i] = new Student(id, name, math, chi, eng);
			sc.nextLine();
		}
		// 先看一下
		System.out.println(Arrays.toString(stus));
		// 存入文件,在当前工程目录下
		FileWriter fw = new FileWriter("stud.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		for (Student stu : stus) {
			if (stu != null) {
				bw.write(stu.toString() + "\r\n");
			}
		}
		bw.close();
	}

}

class Student {
	private String id;
	private String name;
	private int math;
	private int chi;
	private int eng;
	private double aver;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String id, String name, int math, int chi, int eng) {
		super();
		this.id = id;
		this.name = name;
		this.math = math;
		this.chi = chi;
		this.eng = eng;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getChi() {
		return chi;
	}

	public void setChi(int chi) {
		this.chi = chi;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public double getAver() {
		return aver = ((double) math + chi + eng) / 3;
	}

	@Override
	public String toString() {
		return id + ".." + name + ", math=" + math + ", chi=" + chi + ", eng="
				+ eng + ", aver=" + getAver();
	}

}
