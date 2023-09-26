package ex03;

class Box<T>{
	private T ob;


	public void set(T ob) {
		this.ob = ob;
	}
	public T get() {return this.ob;}
}
class Unboxer{
	private static int i;

	public static <T> int openBox(Box<T> box){//제네릭 메서드 시그니처<T> 반환타입<T> 메서드(매개변수 타입 T)
		
		if(box.get().equals("sweet")) i = 1;
		
		return i;
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
		
		int str = Unboxer.openBox(box);
		System.out.println(str);
	}

}
