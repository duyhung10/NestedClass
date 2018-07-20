package staticexample;

public class StaticNestedClass {
	static int data = 30;
	
	static class Inner {
		void show() {
			System.out.println("Data is " + data);
		}
		
		static void show2() {
			System.out.println("Im a static methor.");
		}
	}
	
	public static void main(String[] args) {
		StaticNestedClass.Inner obj = new StaticNestedClass.Inner();
		obj.show();
		
		StaticNestedClass.Inner.show2();
	}
}
