package coom.imooc.model;

public class Subject {
	private String major;
	private String majorNum;
	private int year;
	private String name;
	private String stdNum;
	private char sex;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStdNum() {
		return stdNum;
	}

	public void setStdNum(String stdNum) {
		this.stdNum = stdNum;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMajor() {
		return major;
	}

	public String getMajorNum() {
		return majorNum;
	}

	public int getYear() {
		return year;
	}

	public Subject(String name, String stdNum, char sex, int age) {
		this.major = "�������ѧ��Ӧ��";
		this.majorNum = "J0001";
		this.year = 4;
		this.setSex(sex);
		this.setName(name);
		this.setStdNum(stdNum);
		this.setAge(age);
	}

	public void print() {
		System.out.println("ѧ����Ϣ����:\n" + "����:" + this.getName() + '\n' + "ѧ��:" + this.getStdNum() + '\n' + "�Ա�:"
				+ this.getSex() + '\n' + "����:" + this.getAge() + '\n' + "����רҵ����:" + this.getMajor() + '\n' + "ѧ��ѧ��:"
				+ this.getMajorNum());
		System.out.println("==============================");
	}
}
