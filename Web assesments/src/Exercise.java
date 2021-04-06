// The answer must have balanced parentheses
// This is an example of "double dispatch"

interface Animal {
	public boolean eats(Animal o);

	public boolean isEatenBy(Animal o);
}

class Cat implements Animal {
	public boolean eats(Animal o) {
		return o.isEatenBy(this);
	}

	public boolean isEatenBy(Animal o) {
		if (o.equals(this)) {
			return false;
		} else {
			return true;
		}
	}
}

class Dog implements Animal {
	public boolean eats(Animal o) {
		return o.isEatenBy(this);
	}

	public boolean isEatenBy(Animal o) {
		if (o.equals(this)) {
			return false;
		} else {
			return true;
		}
	}
}

public class Exercise {
	public static void main(String[] args) {
		Animal a = new Dog();
		Animal b = new Cat();

		assert a.eats(b);
		assert !b.eats(b);
	}
}
