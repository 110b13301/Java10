class Caaa {
	public int num1;
	public int num2;
	public Caaa() {
		num1=1;
		num2=1;
	}
	public Caaa(int a,int b) {
		num1=a;
		num2=b;
	}
}
class Cbbb extends Caaa {
	void set_num(int n1,int n2) {
		num1=n1;
		num2=n2;
	}
	void show() {
		System.out.println(num1+", "+num2);
	}
	public Cbbb() {
	}
	public Cbbb(int a,int b) {
		super(a, b);
	}
}
public class Class03 {

	public static void main(String[] args) {
		Cbbb a=new Cbbb();
		a.show();
		Caaa b=new Caaa(2, 3);
		System.out.println(b.num1+", "+b.num2);
		Cbbb c=new Cbbb(4, 5);
		c.show();
	}
}