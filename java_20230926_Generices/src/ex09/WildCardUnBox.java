package ex09;

class Box<T>{
	private T ob;
	public void set(T ob) { this.ob = ob; }
	public T get() { return ob; }
	
	@Override
	public String toString() { return ob.toString(); }
}

class Unboxer{
	public static <T> T openBox(Box<T> box) {//제네릭 메서드
		return box.get();
	}
	public static void peekBox(Box<?> box) {//와일드 카드 메서드
		System.out.println(box);
	}
}
public class WildCardUnBox {


	public static void main(String[] args) {
		Box<String> box = new Box();
		box.set("simple String");
		
		Unboxer.peekBox(box);
		String str = Unboxer.openBox(box);
		System.out.println("openBox : " + str);
		
	}

}
