package ex12;

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

class BoxHandler{
	public static void outBox(Box<Toy> box) {//꺼내기
		Toy t = box.get();
		System.out.println(t);
		//box.set(new Toy());꺼내기만 해야하는데 저장하기가 되네,,?
	}
	public static void inbox(Box<Toy> box, Toy n) {//저장하기
		box.set(n);
//		Toy t = box.get();저장하기만 돼야하는데 꺼내기도 되네,,?
		
	}
}
public class WildCardUnBox {


	public static void main(String[] args) {
		Box<Toy> box = new Box();
		BoxHandler.inbox(box, new Toy());
		BoxHandler.outBox(box);
	}

}
