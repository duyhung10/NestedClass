package nonstatic;

public class AnonymousInnerClass {
	public static void main(String[] args) {
		
		Person p = new Person() { // Mot lop extend lop Person duoc tao ra, ten cua no quyet dinh boi trinh bien dich
			public void eat() {
				System.out.println("Person eating...");
			}
		};
		
		p.eat();
		
		
		Animal a = new Animal() {
			public void eat() {
				System.out.println("Animal eating...");
			}
		};
		
		a.eat();
		
		Animal a2 = () -> {System.out.println("a2 eating...");
		};
		a2.eat();
		
	}
}

abstract class Person {
	abstract void eat();
}

interface Animal {
	abstract void eat();
}