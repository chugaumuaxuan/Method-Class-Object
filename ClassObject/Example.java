package ClassObject;

public class Example {
		String name;
		int id;
		int age;
		String SchoolName;
	
	public Example(){}

	Example(String name, int id, int age, String SchoolName){
		this.name = name;
		this.id = id;
		this.age = age;
		this.SchoolName = SchoolName;
	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSchoolName() {
		return SchoolName;
	}
	
	public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}

	public static void main(String[] args) {
		Example exp = new Example();
		Example exp2 = new Example();
		
		exp.setName("Thang");
		exp.setId(1);
		exp.setAge(22);
		exp.setSchoolName("Haui");
		
		exp2.setName("Nam");
		exp2.setId(2);
		exp2.setAge(23);
		exp2.setSchoolName("Nuce");

		
		System.out.println("Ten "+exp.getName() + " ID " + exp.getId() + " Tuoi "+ exp.getAge() + " Hoc Tai " + exp.getSchoolName() );
		
		System.out.println("Ten "+exp2.getName() + " ID " + exp2.getId() + " Tuoi "+ exp2.getAge() + " Hoc Tai " + exp2.getSchoolName() );
	}
	
}
