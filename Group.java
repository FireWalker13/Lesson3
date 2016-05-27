package pack;

public class Group {
	private Student [] group = new Student [10];
	private int num=0;

	public Group() {
		super();
	}
	
	public void addStudent (Student a){
		try{
			if (num==10){
				throw new MaxGroupSizeException();}
			else {
			group[num]=a;
			num++;}}
		catch(MaxGroupSizeException e){
			System.out.println(e.getMessage());
		}
	}
	public Student findStudent(String b){
		for (int i=0;i<group.length;i++){
			if (group[i].getSurname()==b){
				return group[i];
			}
		}
		return null;
	}
	
	}

