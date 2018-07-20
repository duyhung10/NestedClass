package nonstatic;

public class MemberInnerClass {
	private int data = 30;
	
	class Inner {
		void show() {
			System.out.println("Data is " + data); 	// Truy cap duoc thuoc tinh private cua lop ngoai
		}
	}
	
	public static void main(String[] args) {
		MemberInnerClass obj = new MemberInnerClass();
		MemberInnerClass.Inner inner = obj.new Inner();
		inner.show();
	}
}
