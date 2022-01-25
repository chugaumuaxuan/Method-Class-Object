package ClassObject;

public class Student2 {
	int rollno;
	String name;
	
	void insertRecord(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
	
	void display() {
		System.out.println(rollno + " " + name);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 st1 = new Student2();
		Student2 st2 = new Student2();
		
		st1.insertRecord(1,"Doan Thang");
		st2.insertRecord(2, "Tran Nam");
		
		st1.display();
		st2.display();
		
	}

}
