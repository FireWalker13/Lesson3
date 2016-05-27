package pack;

public class Student extends Human {
	private int recBookNum;

	public Student(String name, String surname, int age, boolean sex, int recBookNum) {
		super(name, surname, age, sex);
		this.recBookNum = recBookNum;
	}
	
	public int getRecBookNum() {
		return recBookNum;
	}



	public void setRecBookNum(int recBookNum) {
		this.recBookNum = recBookNum;
	}


	@Override
	public String toString() {
		return "Student [name=" + getName() + ", surname=" + getSurname() + ", age=" + getAge() + ", sex=" + isSex()
		+", recBookNum = " + recBookNum + "]";
	}
	
	

	}
	
	
