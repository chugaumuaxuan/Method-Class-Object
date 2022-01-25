package Return;

public class HamTraVeKQ {
	
	
	public static int TongHaiSo(int a, int b){
		return a+b;
	}
	
	public static int tich() {
		int num1 = 5;
		int num2 = 6;
		return num1 * num2 ;
	}
	
	 float thuong() {
		float num3 = 10;
		float num4 = 3;
		return num3 / num4;
	}
	
	 long minus() {
		 long c = 1;
		 long d = 34;
		 return d - c;
	 }
	
	 
	public static void main(String[] args) {
		HamTraVeKQ a = new HamTraVeKQ();
		
		int sum = TongHaiSo(2 , 5);
		System.out.println(sum);
		
		int mul = tich();
		System.out.println(mul);
		
		System.out.println(a.thuong());
		
		System.out.println(a.minus());
	}	
}
