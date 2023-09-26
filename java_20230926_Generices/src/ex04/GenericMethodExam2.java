package ex04;

class Box<T>{
	private T ob;
	
//	Box(T o){
//		set(o);
//	}

	public void set(T ob) {
		this.ob = ob;
	}
	public T get() {return this.ob;}
}
class Unboxer{
	public static <T> T openBox(Box<T> box){//제네릭 메서드 시그니처<T> 반환타입<T> 메서드(매개변수 타입 T)
		return box.get();
	}


}
public class GenericMethodExam2 {

	public static void main(String[] args) {
//		String box = Unboxer.openBox(new Box("sweet")); //T : String 가정 : sweet 출력 되게 끔
//		System.out.println(box);
		
//		String box = Unboxer.openBox(new Box<String>("sweet"));
//		System.out.println(box);
		Box<String> box = new Box<String>();
		box.set("sweet");
		
		String str = Unboxer.openBox(box);
		System.out.println(str);
	}

}
