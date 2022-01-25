package Return;

import java.util.*;


public class HamTraVeKhongKQ {
	
	Scanner sc = new Scanner(System.in);
	
	
	void foo() {
		double a = sc.nextDouble();
		if(a < 100 && a > 10) {
			System.out.println("a la so co hai chu so");
		}else {
			System.out.println("a khong phai la so co hai chu so");
		}
	}

	void display() {
		System.out.println("Chuc mung nam moi");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HamTraVeKhongKQ b = new HamTraVeKhongKQ();
		b.foo();
		b.display();
	}

}