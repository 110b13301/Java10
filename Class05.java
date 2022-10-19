class Caaa {
	private int num;
	public Caaa(int n) {
		num=n;
	}
	public Caaa() { //5 create empty constructor to pervent error
	}
	public int get() {
		return num;
	}
}
class Cbbb extends Caaa {
	public Cbbb(int n) { //5 show"num=2"
		super(n);
	}
	public void show() {
		System.out.println("num="+get());
	}
}
public class Class05 {
	public static void main(String[] args) {
		Cbbb bb=new Cbbb(2); //5 show"num=2"
		bb.show();
	}
}