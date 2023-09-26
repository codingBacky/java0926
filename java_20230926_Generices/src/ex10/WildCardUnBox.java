package ex10;

class Box<T>{
	private T ob;
	public void set(T ob) { this.ob = ob; }
	public T get() { return ob; }
	
	@Override
	public String toString() { return ob.toString(); }
}

class Unboxer{
	                             //상한제한
	public static void peekBox(Box<? extends Number> box) {//와일드 카드 메서드
		System.out.println(box);
	}
}
public class WildCardUnBox {


	public static void main(String[] args) {
		Box<Integer> box = new Box();
		box.set(1234);
		
		Box<Double> box2 = new Box();
		box2.set(123.123);
		
		Unboxer.peekBox(box);
		Unboxer.peekBox(box2);
		
	}

}
