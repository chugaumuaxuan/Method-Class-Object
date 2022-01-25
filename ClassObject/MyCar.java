package ClassObject;

public class MyCar {
	 String name;
	 int GiaXe;

	public void MyCar(String name, int GiaXe) {
		 this.name = name;
		 this.GiaXe = GiaXe;
	 }
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Xe cua toi la :" +name);
	}

	public int getGiaXe() {
		return GiaXe;
	}

	public void setGiaXe(int giaXe) {
		GiaXe = giaXe;
		System.out.println("Gia xe cua toi la :" + GiaXe );
	}

	public static void main(String[] args) {
		MyCar MyCar = new MyCar();
		MyCar.setName("Huyndai");
		MyCar.setGiaXe(100000);
		
		MyCar.getName();
		MyCar.getGiaXe();
		
	}
	
}
