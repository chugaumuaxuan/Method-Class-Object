package ClassObject;

public class Retangle {
	int length, width;

	void Insert(int dai, int rong) {
		this.length = dai;
		this.width = rong;
	}
	
	void DienTich() {
		int dientich = length * width;
		System.out.println("Dien tich hinh chu nhat la: "+ dientich );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Retangle hcn1 = new Retangle();
		Retangle hcn2 = new Retangle();
		
		hcn1.Insert(4, 5);
		hcn2.Insert(19, 6);
		
		hcn1.DienTich();
		hcn2.DienTich();
	}

}
