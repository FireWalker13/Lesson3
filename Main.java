package pack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Group group = new Group();
		Student st1 = new Student ("Ivan","Ivanov",60,true,1525);
		Student st2 = new Student ("Piotr","Petrov",58,true,1526);
		Student st3 = new Student ("Vasilisa","Vasilyeva",16,false,1521);
		Student st4 = new Student ("Yakov","Yakovlev",16,true,1527);
		Student st5 = new Student ("Pupok","Pupkin",18,true,1529);
		Student st6 = new Student ("Maria","Krivonog",19,false,1510);
		Student st7 = new Student ("Hodor","Hodor",21,true,1511);
		Student st8 = new Student ("Oleg","Lyashko",43,true,1567);
		Student st9 = new Student ("Arsen","Avakov",52,true,1566);
		Student st10 = new Student ("Freddy","Mercury",40,true,1533);
		Student st11 = new Student ("Kurt","Cobain",40,true,1534);
		
		group.addStudent(st1);
		group.addStudent(st2);
		group.addStudent(st3);
		group.addStudent(st4);
		group.addStudent(st5);
		group.addStudent(st6);
		group.addStudent(st7);
		group.addStudent(st8);
		group.addStudent(st9);
		group.addStudent(st10);
		group.addStudent(st11);
		
		System.out.println(group.findStudent("Lyashko"));
		
	}

}
