package ex07;

class Box<T>{
	private T ob;
	
//	public Box(T ob) {
//		this.ob = ob;
//	}
	public void set(T ob) {
		this.ob = ob;
	}
	public T get() {return this.ob;}
}

class SteelBox<T> extends Box<T>{
	public SteelBox(T ob) {
		super.set(ob);
//		super(ob);
	}
}
public class GenericMethodExam {

	public static void main(String[] args) {
		Box<Integer> iBox = new SteelBox(Integer.valueOf(9999));
		Box<String> sBox = new SteelBox(new String("Sweet"));
		
//		Box<String> sBox1 = new SteelBox(Integer.valueOf(9999));
		
		
		
		System.out.println(iBox.get());
		System.out.println(sBox.get());
//		System.out.println(sBox1.get());
		
	}

}
