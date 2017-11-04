package JavaManual;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/*�����ѧ����ÿ��ѧ����3�ſεĳɼ����Ӽ�����������
 * ����(����ѧ���ţ����������ſγɼ�)�������ƽ����
 * ������ԭ�е����ݺͼ������ƽ����������ڴ����ļ�
 * "stud"�С�*/
public class _50Student {

	public static void main(String[] args) throws IOException {
		Student[] stus = new Student[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("��¼�����ѧ����ѧ���ţ����������ſγɼ���");
		String id;
		String name;
		int math;
		int chi;
		int eng;
		// ¼����Ϣ
		for (int i = 0; i < 2; i++) {
			System.out.println("ѧ���ţ�");
			id = sc.nextLine();
			System.out.println("������");
			name = sc.nextLine();
			System.out.println("��ѧ�ɼ���");
			math = sc.nextInt();
			System.out.println("���ĳɼ���");
			chi = sc.nextInt();
			System.out.println("Ӣ��ɼ���");
			eng = sc.nextInt();
			stus[i] = new Student(id, name, math, chi, eng);
			sc.nextLine();
		}
		// �ȿ�һ��
		System.out.println(Arrays.toString(stus));
		// �����ļ�,�ڵ�ǰ����Ŀ¼��
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
