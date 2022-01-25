package TruyenThamSoMethod;



public class TruyenThamSo {
	
	public static void HoanDoiViTri(int a, int b) {
		int c = a;
		a = b;
		b = c;
		System.out.println("Sau khi hoan doi: " + " a = " + a + " b = " + b);
	}
	
	public static void main(String[] args) {
		int a = 5; 
		int b = 10;
		System.out.println("Truoc khi hoan doi: " + "a = " + a + " b = " + b);
		HoanDoiViTri(a, b);
	}
	
}
