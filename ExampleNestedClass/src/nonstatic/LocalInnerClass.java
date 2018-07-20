package nonstatic;

public class LocalInnerClass {
	private int data = 30;
	
	void show() {
		class Local {
			int value = 50;
			void print() {
				System.out.println("Data: " + data); 	// Truy cap duoc thuoc tinh private cua lop ngoai
				System.out.println("Value: " + value);
			}
		}
		
		Local local = new Local();
		local.print();
	}
	
	public static void main(String[] args) {
		LocalInnerClass obj = new LocalInnerClass();
		obj.show();
	}
}
