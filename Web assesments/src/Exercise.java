// The answer must have balanced parentheses
class Pair<String, Integer> {
	private S first;
	private T second;

	public Pair(S first, T second) {
		this.first = first;
		this.second = second;
	}

	public S getFirst() {
		return first;
	}

	public T getSecond() {
		return second;
	}
}

public class Exercise {
	public static void main(String[] args) {
		Pair<String, Integer> p1 = new Pair<String, Integer>("Hello", 1);
		assert p1.getFirst().equals("Hello");
		assert p1.getSecond().equals(1);
	}
}
