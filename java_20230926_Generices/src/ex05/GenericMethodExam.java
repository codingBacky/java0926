package ex05;

class Box1<T>{
	private T ob;
	public void set(T ob) {
		this.ob = ob;
	}
	public T get() {return this.ob;}
}
class BoxFactory{
	public static <T> Box1<T> makeBox(T o){//제네릭 메서드 시그니처<T> 반환타입<T> 메서드(매개변수 타입 T)
		Box1<T> box = new Box1<T>();
		box.set(o);
		return box;
	}
}
public class GenericMethodExam {

	public static void main(String[] args) {
		Box1<String> sBox = BoxFactory.<String>makeBox("sweet");
		System.out.println(sBox.get());
		
		Box1<Double> dBox = BoxFactory.makeBox(7.59);
		System.out.println(dBox.get());
		
	}

}
