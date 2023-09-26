package ex06;

class Box<T>{
	private T ob;
	public void set(T ob) {
		this.ob = ob;
	}
	public T get() {return this.ob;}
}
class BoxFactory{
	public static <T extends Number> Box<T> makeBox(T o){//T 는 Number나 Number을 상속받은 클래스 타입만 가능
		Box<T> box = new Box<T>();
		box.set(o);
		System.out.println("Boxed data: " + o.intValue());
		return box;
	}
}

class Unboxer{
	public static <T extends Number> T openBox(Box<T> box) {
		System.out.println("unBoxed data: " + box.get().intValue());
		return box.get();	
	}
}

public class GenericMethodExam {

	public static void main(String[] args) {
		//Integer.valueOf()캐싱을 활용하여 작은 정수 값을 JVM 시작시 한번만 만들어 참조하여 반환하도록 함
		Box<Integer> aBox = BoxFactory.makeBox(Integer.valueOf(9900));
		Box<Integer> sBox = BoxFactory.makeBox(9900);//9900을 알아서 Integer로 박싱해서 넣어줌
		int n = Unboxer.openBox(sBox);
		System.out.println(n);
		
	}

}
