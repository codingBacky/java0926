package ex13;

class Box<T>{
	private T ob;
	public void set(T ob) { this.ob = ob; }
	public T get() { return ob; }
	
	@Override
	public String toString() { return ob.toString(); }
}

class Toy{
	@Override
	public String toString() { return "i'm a Toy"; }
}
class Car{
	@Override
	public String toString() { return "i'm a car"; }
}

class BoxHandler{
							//상한제한 => 목적 : get 가능, set 불가
	public static void outBox(Box<? extends Toy> box) {//꺼내기
		Toy t = box.get();
		System.out.println(t);
		//box.set(new Toy());//get만 가능
	}
	public static void inbox(Box<? super Toy> box, Toy n) {//저장하기
		box.set(n);
//		Toy t = box.get();
		
	}
}
public class WildCardUnBox {


	public static void main(String[] args) {
		Box<Toy> box = new Box();
		BoxHandler.inbox(box, new Toy());
		BoxHandler.outBox(box);
	}

}
