class Car {
	protected String owner;
	protected String id;
	public Car(String own, String s) { //17(a)create constructor
		owner=own;
		id=s;
	}
	final void show() {
		System.out.println("車主姓名:"+owner);
		System.out.println("車牌號碼:"+id);
	}
}
class CColor extends Car { //17(b) create class extends main class
	protected String color;
	public CColor(String own, String s, String c) {
		super(own, s);//17(c) call own and s
		color=c;
	}
	public void show(int c) { //17(d, e) override main constructer show()(cannot override final method)
		System.out.println("車主姓名:"+owner);
		System.out.println("車牌號碼:"+id);
		System.out.println("車身顏色:"+color);
	}
}
public class Class17 {
	public static void main(String[] args) {
		CColor mycar=new CColor("Riann", "A1-2345", "Black");
		mycar.show(0);
	}
}