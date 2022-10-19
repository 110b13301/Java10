class Caaa {
	private int num;
	public Caaa (int n) {
		num=n;
	}
	public int get() {
		return num;
	}
	public Caaa() { //create empty constructor for Cbbb
	}
	void display() {
		System.out.print("printed from Caaa class"); //9(a)
	}
}
class Cbbb extends Caaa {
	public void show() {
		System.out.print("num="+get());
	}
	void display() {
		System.out.print("printed from Cbbb class"); //9(b)
	}
}
public class Class09 {
	public static void main(String[] args) {
		Caaa bb=new Cbbb();
		bb.display(); // 9(c)"printed from Cbbb class"
	}
}